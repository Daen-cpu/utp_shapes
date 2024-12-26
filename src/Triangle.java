public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    // Конструктор треугольника
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || c + a <= b) {
            throw new InvalidFigureException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
