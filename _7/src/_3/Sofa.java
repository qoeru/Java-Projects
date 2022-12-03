package _3;

public class Sofa extends Furniture{
    private Boolean soft;

    public Sofa(String name, int price, String quality, Boolean soft) {
        super(name, price, quality);
        this.soft = soft;
    }

    public Boolean getSoft() {
        return soft;
    }

    public void setSoft(Boolean soft) {
        this.soft = soft;
    }
}
