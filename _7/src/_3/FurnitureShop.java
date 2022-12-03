package _3;

public class FurnitureShop {
    public static void main(String[] args)
    {
        Chair C = new Chair("Табуретка", 1000, "Среднее", "Круглая");
        Sofa S = new Sofa("Диван", 4000, "Отличное", false);

        C.Sell();
        S.Sell();
    }
}
