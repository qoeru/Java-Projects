public class Rectangle extends Square{
    private int sideB;

    public Rectangle(String name, int perimeter, int sideA, int sideB) {
        super(name, perimeter, sideA);
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
