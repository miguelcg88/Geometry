public class Point {

    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point, int offsetX, int offsetY) {
        this(point.x + offsetX, point.y - offsetY);
    }

    public double distanceTo(Point other) {
        double deltaX = x - other.x;
        double deltaY = y - other.y;
        return Math.sqrt(deltaX*deltaX + deltaY * deltaY);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof  Point) {
            return x == ((Point)otherObject).x && y == ((Point)otherObject).y;
        }
        else {
            return false;
        }
    }

    public double calculateAngleInRadians(Point other) {
        return (double)(other.y - this.y)/(double)(other.x - this.x);
    }

    public boolean isSurroundedBy(Point firstPoint, Point secondPoint) {
        int minX = Math.min(firstPoint.x, secondPoint.x);
        int maxX = Math.max(firstPoint.x, secondPoint.x);
        boolean xIsInRange = minX <= x && x <= maxX;

        int minY = Math.min(firstPoint.y, secondPoint.y);
        int maxY = Math.max(firstPoint.y, secondPoint.y);
        boolean yIsInRange = minY <= y && y <= maxY;

        return xIsInRange && yIsInRange;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
