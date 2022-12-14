package Shape;

public abstract class Shape implements Comparable<Shape>{
    public abstract double getArea();

    @Override
    public int compareTo(Shape another) {
        return Double.compare(this.getArea(), another.getArea());
    }
}
