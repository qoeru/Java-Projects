public class MovablePoint implements Movable{
    private int x;
    private int y;

    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public boolean checkSpeed(){
        return (speedX == speedY);
    }


    @Override
    public void move() {
        System.out.println("Point moved!");
    }
}
