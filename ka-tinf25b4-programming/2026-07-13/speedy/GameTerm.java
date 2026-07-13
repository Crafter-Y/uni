package speedy;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameTerm extends JFrame implements GameClient {
    private final String playerName;
    private final Game game;
    private final List<QuestionNumberLabel> questionLabels = new ArrayList<>();
    private final JLabel questionField;
    private final JLabel timeField;
    private int points = 0;

    private final List<JButton> answerButtons = new ArrayList<>();

    public GameTerm(String playerName, Game game) {
        this.playerName = playerName;
        this.game = game;

        JPanel vertical = new JPanel();
        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));

        JPanel labelRow = new JPanel();

        for (int i = 0; i < game.getQuestions().size(); i++) {
            QuestionNumberLabel question = new QuestionNumberLabel((i+1) + "");
            questionLabels.add(question);
            labelRow.add(question);
        }

        vertical.add(labelRow);

        questionField = new JLabel(this.game.getQuestions().getFirst().questionText());
        JPanel qh = new JPanel();
        qh.add(questionField);
        vertical.add(qh);

        timeField = new JLabel("10");
        JPanel th = new JPanel();
        th.add(timeField);
        vertical.add(th);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2,2,2));

        for (int i = 0; i < 4; i++) {
            JButton answerButton = new JButton("");
            int finalI = i;
            answerButton.addActionListener(_ -> {
                game.answerSelected(this, finalI);
            });

            answerButtons.add(answerButton);
            buttonPanel.add(answerButton);
        }

        vertical.add(buttonPanel);

        this.add(vertical);
        this.setSize(550, 200);
        this.setResizable(false);
        this.setTitle(playerName);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public String getPlayerName() {
        return this.playerName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public void setQuestion(int questionIndex, Question q) {
        this.setAnswerState(questionIndex, Status.ACTIVE);

        this.questionField.setText(q.questionText());
        for (int i = 0; i < 4; i++) {
            this.answerButtons.get(i).setText(q.answers()[i]);
        }
    }

    @Override
    public void setRemainingSeconds(int seconds) {
        this.timeField.setText(seconds + "");
    }

    @Override
    public void gameIsOver() {
        for (int i = 0; i < 4; i++) {
            this.answerButtons.get(i).setEnabled(false);
        }
    }

    @Override
    public void setAnswerState(int questionIndex, Status status) {
        this.questionLabels.get(questionIndex).setStatus(status);

        if (status == Status.CORRECT) points++;
    }
}
