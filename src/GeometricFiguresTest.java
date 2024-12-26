import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeometricFiguresTest {

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea(), 0.01);
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.calculatePerimeter(), 0.01);
    }

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(7);
        assertEquals(49 * Math.PI, circle.calculateArea(), 0.01);
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(7);
        assertEquals(14 * Math.PI, circle.calculatePerimeter(), 0.01);
    }

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.calculateArea(), 0.01);
    }

    @Test
    public void testTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.calculatePerimeter(), 0.01);
    }

    @Test
    public void testInvalidRectangle() {
        assertThrows(InvalidFigureException.class, () -> new Rectangle(-5, 10));
    }

    @Test
    public void testInvalidCircle() {
        assertThrows(InvalidFigureException.class, () -> new Circle(-7));
    }

    @Test
    public void testInvalidTriangle() {
        assertThrows(InvalidFigureException.class, () -> new Triangle(1, 2, 3));
    }
}
