package Shape;

public class Triangle extends Shape {
    private double altitude;
    private double base;

    public Triangle(double altitude, double base) {
        this.altitude = altitude;
        this.base = base;
    }

    public Triangle() {
    }

    public double getAltitude() {
        return altitude;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return altitude * base / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "altitude=" + altitude +
                ", base=" + base +
                ", area=" + getArea() +
                '}';
    }
}
