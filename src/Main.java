public class Main {
    public static void main(String[] args) {
        try {
            // Создаем объект прямоугольника
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

            // Создаем объект круга
            Circle circle = new Circle(7);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            // Создаем объект треугольника
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Triangle Area: " + triangle.calculateArea());
            System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        } catch (InvalidFigureException e) {
            // Обработка ошибки, если фигура с такими параметрами не существует
            System.out.println(e.getMessage());
        }
    }
}
