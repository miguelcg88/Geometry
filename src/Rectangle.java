public class Rectangle {
    private final int width;
    private final int height;
    private Point topLeftCorner;

    public Rectangle(Point corner, int width, int height) {
        topLeftCorner = corner;
        this.width = width;
        this.height = height;
    }

    public boolean contains(Point point) {
        Point bottomRightCorner = new Point(topLeftCorner, width, height);
        return point.isSurroundedBy(topLeftCorner, bottomRightCorner);
    }
}
