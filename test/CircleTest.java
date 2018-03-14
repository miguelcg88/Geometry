import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircleTest {

    //Verify that a point is  inside a circle
    @Test
    public void circleContainsPoint() {
        Point point = new Point(0, 0);
        Circle circle = new Circle(5,new Point(0,0));

        assertTrue(circle.pointInsideCircle(point));
    }
    //Verify that a point is not in a circle
    @Test
    public void circleDoesNotContainsPoint() {
        Point point = new Point(0, 8);
        Circle circle = new Circle(5,new Point(0,0));

        assertFalse(circle.pointInsideCircle(point));
    }
    //Verify that a point  is  in a circle  (at border)
    @Test
    public void pointIsInTheCircle() {
        Point point = new Point(0, 5);
        Circle circle = new Circle(5,new Point(0,0));

        assertTrue(circle.pointIsInCircle(point));
    }
    //Verify that a line is  in a circle
    @Test
    public void lineIsInTheCircle() {
        Point start = new Point(0, 0);
        Point end = new Point(0, 1);
        Line line = new Line(start, end);
        Circle circle = new Circle(5,new Point(0,0));

        assertTrue(circle.lineIsInCircle(line));
    }
    //Verify that a line is not in a circle
    @Test
    public void lineIsNotInTheCircle() {
        Point start = new Point(0, 0);
        Point end = new Point(6, 9);
        Line line = new Line(start, end);
        Circle circle = new Circle(5,new Point(0,0));

        assertFalse(circle.lineIsInCircle(line));
    }

}
