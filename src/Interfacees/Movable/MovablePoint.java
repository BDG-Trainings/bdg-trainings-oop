package Interfacees.Movable;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int speedx;
    protected int speedy;

    public MovablePoint(int x, int y, int speedx, int speedy){
        this.x=x;
        this.y=y;
        this.speedx=speedx;
        this.speedy=speedy;
    }
    @Override
    public void moveUp() {
        this.y = y + speedy;
    }

    @Override
    public void moveDown() {
        this.y= y-speedy;
    }
    @Override
    public void moveLeft() {
        this.x= x- speedx;
    }
    @Override
    public void moveRight() {
        this.x = x +speedx;
    }
    @Override
    public String toString(){
        return "MovablePoint [x ="+x+","+ "y="+ y+"]";
    }

    public static void main(String[] args) {
        MovablePoint movablePoint= new MovablePoint(2,3,1,1);
        movablePoint.moveRight();
        System.out.print(movablePoint);
    }


}
