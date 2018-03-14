public class Line {
    protected Point start, end;
    private double angle;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        angle = start.calculateAngleInRadians(end);
    }

    public double length() {
        // tell, don't ask
        return Double.POSITIVE_INFINITY;
    }

    public boolean contains(Point point) {
        if (point.equals(start)) {
            return true;
        }
        return angle == point.calculateAngleInRadians(start);
    }

    public boolean contains(Line other) {
        return contains(other.start) && contains(other.end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
