public class Circle implements Shape {
    private double radius;

    // Конструктор круга
    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidFigureException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
