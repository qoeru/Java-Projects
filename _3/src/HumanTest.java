public class HumanTest {
    public static void main(String[] args) {
        Human David = new Human();
        Human.Leg DavidLeg = David.new Leg(70, "leggie");
        Human.Head DavidHead = David.new Head(20, "heаddie");
        Human.Hand DavidHand = David.new Hand(10, "handie");

        System.out.println("Имя ноги: " + DavidLeg.getName() + "; Длина ноги: " + DavidLeg.getLength());
        System.out.println("Имя головы: " + DavidHead.getName() + "; Длина волос: " + DavidHead.getHairLength());
        System.out.println("Имя руки: " + DavidHand.getName() + "; Количество пальцев: " + DavidHand.getFingerNum());

        DavidHand.setName("Правая рука");
        DavidHead.setHairLength(90);
        DavidLeg.setName("Лапа");


        System.out.println("\nИзменённые данные:");
        System.out.println("Имя ноги: " + DavidLeg.getName() + "; Длина ноги: " + DavidLeg.getLength());
        System.out.println("Имя головы: " + DavidHead.getName() + "; Длина волос: " + DavidHead.getHairLength());
        System.out.println("Имя руки: " + DavidHand.getName() + "; Количество пальцев: " + DavidHand.getFingerNum());

    }
}
