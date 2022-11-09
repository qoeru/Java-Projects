public class Square extends Shape{
    protected int sideA;

    public Square(String name, int perimeter, int sideA) {
        super(name, perimeter);
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
}
