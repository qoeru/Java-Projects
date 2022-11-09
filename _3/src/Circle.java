public class Circle {
    private int radius;
    private int diameter;


    public Circle(int radius) {
        this.radius = radius;
        diameter = radius * 2;
    }


    public int getDiameter() {
        return diameter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }
}
