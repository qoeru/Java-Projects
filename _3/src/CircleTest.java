public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Радиус: " + circle.getRadius() + "; Диаметр: " + circle.getDiameter());
        circle.setRadius(7);
        System.out.println("Новый радиус: " + circle.getRadius() + "; Новый диаметр: " + circle.getDiameter());
    }
}
