package speedy;

public interface GameClient {
    String getPlayerName();
    int getPoints();
//    default void setQuestion(int questionIndex, Question q) {
//        this.setAnswerState(questionIndex, Status.ACTIVE);
//    }
    void setQuestion(int questionIndex, Question q);
    void setRemainingSeconds(int seconds);
    void gameIsOver();
    void setAnswerState(int questionIndex, Status status);
}
