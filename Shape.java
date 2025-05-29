public class Shape {
    public double getArea() {
        return 0.0;
    }
    public static void main(String[] args)
    {
        Shape rectangle = new Shape.rectangle(5, 10);
        double area = rectangle.getArea();
        System.out.println("Area is: " + area);
    }
    static class rectangle extends Shape {
        private double length;
        private double width;

        public rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double getArea() {
            return length * width;
        }
    }
}