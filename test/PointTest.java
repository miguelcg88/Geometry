import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void createPointWithoutParameters() {
        Point point = new Point();
        assertTrue(point instanceof Point);
    }

    // distance

    @Test
    public void distanceToSamePointIsZero() {
        Point point = new Point();
        double distance = point.distanceTo(point);
        assertEquals(0, distance, 0);
    }

    @Test
    public void distanceToOtherPointOIsCalculatedFromPythagorasTheorem() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(3, 4);

        assertEquals(5, firstPoint.distanceTo(secondPoint), 0);
        assertEquals(5, secondPoint.distanceTo(firstPoint), 0);
    }

    // identity

    @Test
    public void pointIsEqualToOtherWithSameCoordinates() {
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(3, 4);

        boolean equals = firstPoint.equals(secondPoint);
        assertTrue(equals);

        assertEquals(firstPoint, secondPoint);
    }

    @Test
    public void pointIsDifferentToOtherWithDifferentCoordinates() {
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(3, 5);

        boolean equals = firstPoint.equals(secondPoint);
        assertFalse(equals);
    }

    @Test
    public void pointIsNotEqualToString() {
        Point point = new Point();

        assertFalse(point.equals(""));
    }

    @Test
    public void isNotSurroundedByPointsAtTheLeft() {
        Point firstPoint = new Point();
        Point secondPoint = new Point(-1, -2);

        Point point = new Point(2,2);

        //assertFalse(point.isSurroundedBy(firstPoint, secondPoint));
        assertFalse(point.isSurroundedBy(secondPoint, firstPoint));

    }

    @Test
    public void isSurroundedByPointsWithDifferentPositions() {
        Point firstPoint = new Point();
        Point secondPoint = new Point(firstPoint, 10, 45);
        Point innerPoint = new Point(5, -5);

        assertTrue(innerPoint.isSurroundedBy(firstPoint, secondPoint));
    }

}
