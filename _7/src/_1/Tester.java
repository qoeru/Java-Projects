package _1;

public class Tester {
    public static void main(String[] args) {
        Plate T = new Plate("Тарелка", 10);
        Cup C = new Cup("Кружка", 300);

        C.Wash();
        T.Wash();
        C.Empty();
        T.Crash();
    }
}
