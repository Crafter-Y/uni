package game;

public class Player {
    private final String name;
    private int countDartsThrown = 0;
    private final Visit[] visits = new Visit[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCountDartsThrown() {
        return this.countDartsThrown;
    }

    public Visit[] getVisits() {
        return this.visits;
    }

    public int getRemainingPoints() {
        int sum = 0;

        for (int i = 0; i < this.visits.length; i++) {
            if (this.visits[i] != null) sum += this.visits[i].getValue();
        }

        return 501 - sum;
    }

    public boolean addVisit(Visit visit) {
        int pointsAfter = this.getRemainingPoints() - visit.getValue();

        this.countDartsThrown += visit.getFields().length;

        if (pointsAfter < 0 || pointsAfter == 1) return false;
        if (pointsAfter == 0 && !visit.getLastField().isDoubleField()) return false;

        for (int i = 0; i < this.visits.length; i++) {
            if (this.visits[i] == null) {
                this.visits[i] = visit;
                break;
            }
        }

        return true;
    }

    public String toString() {
        return String.format("Player: %s, %d points remaining.", this.name, this.getRemainingPoints());
    }
}
