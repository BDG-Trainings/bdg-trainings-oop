package Interface.Movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center=new MovablePoint(3,4,1,1);

    public MovableCircle(int x, int y, int speedx, int speedy, int radius){
        this.radius=radius;
        center.x = x;
        center.y = y;
        center.speedx = speedx;
        center.speedy=speedx;
    }
    @Override
    public void moveUp() {
        this.center.y = center.y + center.speedy;

    }

    @Override
    public void moveDown() {
        this.center.y = center.y - center.speedy;

    }

    @Override
    public void moveLeft() {
        this.center.x = center.x - center.speedx;


    }

    @Override
    public void moveRight() {
        this.center.x = center.x + center.speedx;

    }
    @Override
    public  String toString(){
        return "Circle [Radius="+ radius+","+"center"+ center+"]";
    }

    public static void main(String[] args) {
        MovableCircle circle=new MovableCircle(2, 3, 1, 1, 4);
        System.out.print(circle.center);
    }
}
