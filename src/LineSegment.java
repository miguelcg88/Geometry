public class LineSegment extends Line {

    public LineSegment(Point start, Point end) {
        super(start, end);
        start.equals(end);
    }

    @Override
    public boolean contains(Point point) {
        boolean pointMeetsFormula = super.contains(point);
        boolean pointIsInRange = point.isSurroundedBy(start, end);

        return pointIsInRange && pointMeetsFormula;
    }

    @Override
    public double length() {
        // tell, don't ask
        return start.distanceTo(end);
    }

    @Override
    public boolean contains(Line other) {
        if (other instanceof LineSegment) {
            return super.contains(other);
        }
        else {
            return false;
        }

    }
}
