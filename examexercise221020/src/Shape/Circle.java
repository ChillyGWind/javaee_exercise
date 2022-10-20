package Shape;

public class Circle extends Ellipse {
    public Circle(final double radius) {
        super(radius, radius);
    }

    public Circle() {
    }

    public double getRadius() {
        return getMajorAxis();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "altitude=" + getRadius() +
                ", area=" + getArea() +
                '}';
    }
}
