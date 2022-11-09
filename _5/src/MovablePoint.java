public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move() {
        System.out.println("Point moved!");
    }
}
