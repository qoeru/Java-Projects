public class MovableCircle extends Circle implements Movable{

    MovablePoint center;

    public MovableCircle(String name, int perimeter, int radius) {
        super(name, perimeter, radius);
    }

    @Override
    public void move() {
        System.out.println("Circle moved!");
    }
}
