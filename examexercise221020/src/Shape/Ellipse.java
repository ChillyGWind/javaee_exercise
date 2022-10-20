package Shape;
    public class Ellipse extends Shape {
        private double majorAxis;
        private double minorAxis;

        public Ellipse(final double majorAxis, final double minorAxis) {
            this.majorAxis = majorAxis;
            this.minorAxis = minorAxis;
        }

        public Ellipse() {
        }

        public double getMajorAxis() {
            return majorAxis;
        }

        public double getMinorAxis() {
            return minorAxis;
        }

        @Override
        public double getArea() {
            return Math.PI * majorAxis * minorAxis;
        }

        @Override
        public String toString() {
            return "Ellipse{" +
                    "majorAxis=" + majorAxis +
                    ", minorAxis=" + minorAxis +
                    ", area=" + getArea() +
                    '}';
        }
    }

