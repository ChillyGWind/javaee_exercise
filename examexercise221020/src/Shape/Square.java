package Shape;

/**
 * @author mtage
 * @since 2020/11/19 19:45
 */
public class Square extends Rectangle {
    public Square(double edge) {
        super(edge, edge);
    }

    public Square() {
    }

    public double getEdge() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + getEdge() +
                ", area=" + getArea() +
                '}';
    }
}
