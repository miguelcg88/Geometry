import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineSegmentTest {

    @Test
    public void lineSegmentIsALine() {
        LineSegment segment = new LineSegment(new Point(), new Point(1, 2));

        assertTrue(segment instanceof Line);
    }

    @Test
    public void lengthIsDeterminedByTheDistanceBetweenPoints() {
        Line line = new LineSegment(new Point(), new Point(3, 4));

        double length = line.length();
        assertEquals(5, length, 0);
    }

    @Test
    public void lengthIsTheDistanceBetweenPoints() {
        Line line = new LineSegment(new Point(1, 1), new Point(1, 4));

        assertEquals(3, line.length(), 0);
    }

    @Test
    public void containsInnerPointThatConformsToTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        LineSegment line = new LineSegment(start, end);

        assertTrue(line.contains(new Point(4, 3)));
    }

    @Test
    public void doesNotContainPointThatConformsToTheFormulaButItsOutOfRange() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        LineSegment line = new LineSegment(start, end);

        assertFalse(line.contains(new Point(-4, -3)));
    }

    @Test
    public void doesNotContainLineWithSamePoints() {
        Point start = new Point();
        Point end = new Point(1, 1);

        Line line = new Line(start, end);
        LineSegment segment = new LineSegment(start, end);

        assertFalse(segment.contains(line));
    }
}
