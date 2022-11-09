public class Circle extends Shape {
    private int Radius;

    public Circle(String name, int perimeter, int radius) {
        super(name, perimeter);
        Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }
}
