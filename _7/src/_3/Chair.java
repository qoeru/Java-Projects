package _3;

public class Chair extends Furniture{
    private String shape;

    public Chair(String name, int price, String quality, String shape) {
        super(name, price, quality);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
