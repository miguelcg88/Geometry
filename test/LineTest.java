import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineTest {

    @Test
    public void lineNeedsTwoPointsToBeCreated() {
        Line line = new Line(new Point(), new Point(3, 4));

        assertTrue(line instanceof Line);
    }

    @Test
    public void lengthIsInfinite() {
        Line line = new Line(new Point(), new Point(3, 4));

        assertEquals(Double.POSITIVE_INFINITY, line.length(), 0);
    }



    // contains
    @Test
    public void lineContainsItsStartPoint() {
        Point start = new Point(0, 0);
        Line line = new Line(start, new Point(2, 5));

        assertTrue(line.contains(start));
    }

    @Test
    public void lineContainsItsEndPoint() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 5);
        Line line = new Line(start, end);

        assertTrue(line.contains(end));
    }

    @Test
    public void doesNotContainAPointThatDoesntMeetTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 5);
        Line line = new Line(start, end);

        assertFalse(line.contains(new Point(1, 2)));
    }


    @Test
    public void containsInnerPointThatConformsToTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        Line line = new Line(start, end);

        assertTrue(line.contains(new Point(4, 3)));
    }

    @Test
    public void containsSegmentWithSamePoints() {
        Point start = new Point();
        Point end = new Point(1, 1);

        Line line = new Line(start, end);
        LineSegment segment = new LineSegment(start, end);

        assertTrue(line.contains(segment));
    }

}
