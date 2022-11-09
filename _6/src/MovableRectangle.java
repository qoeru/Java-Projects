public class MovableRectangle extends Rectangle implements Movable{
    MovablePoint pointA;
    MovablePoint pointB;

    public MovableRectangle(String name, int perimeter, int sideA, int sideB, MovablePoint pointA, MovablePoint pointB) {
        super(name, perimeter, sideA, sideB);
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public void move() {
        System.out.println("Rectangle moved!");
    }
}
