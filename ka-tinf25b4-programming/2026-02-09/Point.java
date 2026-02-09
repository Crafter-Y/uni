class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }

    public double getDistanceToCenter() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Point mirrorX() {
        this.y = -this.y;
        return this;
    }

    public Point mirrorY() {
        this.x = -this.x;
        return this;
    }

    public Point mirrorOrigin() {
        this.x = -this.x;
        this.y = -this.y;
        return this;
    }

    public double getDistance(Point otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }

    public static void main() {
        Point pointA = new Point(4.0, 2.0);
        System.out.println("A: " + pointA);
        Point pointB = new Point(-1.0, -1.0);
        System.out.println("B: " + pointB);
        System.out.println("Abstand A-B: "
        + pointA.getDistance(pointB));
        pointA = pointA.mirrorOrigin();
        System.out.println("A': " + pointA);
        System.out.println("Abstand A’-B: "
        + pointA.getDistance(pointB));
    }
}
