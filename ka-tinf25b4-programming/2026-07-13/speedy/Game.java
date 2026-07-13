package speedy;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Game {
    final static String HIGHSCORE_FILE = "./highscore.txt";

    private final List<Question> questions = new ArrayList<>();
    private final List<GameClient> clients = new ArrayList<>();
    private boolean gameStarted = false;
    private int currentQuestion = 0;
    private long gameStartedAt;
    private int countdown = 10;

    public Game(List<Question> questions, int numQuestions) {
        if (questions.size() < numQuestions) throw new GameException("Too few questions available");

        Collections.shuffle(questions);

        for (int i = 0; i < numQuestions; i++) {
            this.questions.add(questions.get(i));
        }
    }

    public void registerClient(GameClient client) {
        if (this.gameStarted) throw new GameException("Game already started");
        this.clients.add(client);
    }

    public int getQuestionsCount() {
        return this.questions.size();
    }

    public void startGame() {
        this.gameStarted = true;
        gameStartedAt = System.currentTimeMillis();

        setQuestion(currentQuestion, this.questions.get(currentQuestion));

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException _) {}

                if (countdown > 0) {
                    countdown--;
                    for (GameClient client : this.clients) {
                        client.setRemainingSeconds(countdown);
                    }
                } else {
                    this.answerSelected(null, -1);
                }
            }
        }).start();
    }

    public void answerSelected(GameClient client, int index) {
        if (!this.gameStarted) return;
        for (GameClient gameClient : this.clients) {
            if (client != null && gameClient.getPlayerName().equals(client.getPlayerName())) {
                Question question = this.questions.get(currentQuestion);
                if (question.correctIndex() == index) {
                    gameClient.setAnswerState(currentQuestion, Status.CORRECT);
                } else {
                    gameClient.setAnswerState(currentQuestion, Status.WRONG);
                }
            } else {
                gameClient.setAnswerState(currentQuestion, Status.NO_ANSWER);
            }
        }
        currentQuestion++;

        boolean ended = currentQuestion == this.questions.size();

        if (ended) {
            for (GameClient gameClient : this.clients) {
                gameClient.gameIsOver();
                this.gameStarted = false;
            }

            endGame();
        } else {
            setQuestion(currentQuestion, this.questions.get(currentQuestion));
        }
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    private void endGame() {
        StringBuilder sb = new StringBuilder();
        sb.append("Game finished after ");
        sb.append((int) ((System.currentTimeMillis() - this.gameStartedAt)/ 1000f));
        sb.append(" seconds, score: ");

        for (GameClient client : clients) {
            sb.append(client.getPlayerName()).append("(").append(client.getPoints()).append("), ");
        }
        JOptionPane.showMessageDialog(null, sb, "Meldung", JOptionPane.INFORMATION_MESSAGE);

        try {
            Path path = Paths.get(HIGHSCORE_FILE);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            Files.writeString(path, sb + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void setQuestion(int questionIndex, Question q) {
        for (GameClient client : clients) {
            client.setQuestion(questionIndex, q);
        }

        this.countdown = 10;
    }
}
