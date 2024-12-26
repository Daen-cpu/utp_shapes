public class Rectangle implements Shape {
    private double width;
    private double height;

    // Конструктор прямоугольника
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new InvalidFigureException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
