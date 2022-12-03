package _3;

public class Furniture {
    protected String name;
    protected int price;
    protected String quality;

    public Furniture(String name, int price, String quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void Sell()
    {
        System.out.println(name + " продан(а)!");
    }
}
