import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void createWithCornerAndDimensions() {
        Rectangle rectangle = new Rectangle(new Point(), 10, 45);

        assertTrue(rectangle != null);
    }

    //contains point
    @Test
    public void containsItsCorner() {
        Rectangle rectangle = new Rectangle(new Point(), 10, 45);

        assertTrue(rectangle.contains(new Point()));
    }

    @Test
    public void doesNotContainPointOutOfTheBorders() {
        Rectangle rectangle = new Rectangle(new Point(), 10, 45);

        assertFalse(rectangle.contains(new Point(-1, -1)));
    }

    @Test
    public void containsAnInnerPoint() {
        Rectangle rectangle = new Rectangle(new Point(), 10, 45);

        assertTrue(rectangle.contains(new Point(5, -5)));
    }
}
