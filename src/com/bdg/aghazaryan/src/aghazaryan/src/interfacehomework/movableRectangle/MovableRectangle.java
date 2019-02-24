package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.movableRectangle;

public class MovableRectangle extends MovablePoint implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed, MovablePoint topLeft,
                            MovablePoint bottomRight) {
        super(x1, y1, x2, y2, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

        topLeft = new MovablePoint(5, 2, 6, 5, 6, 5);
        bottomRight = new MovablePoint(5, 2, 6, 5, 6, 5);

    }

    @Override
    public String toString() {
        return "movableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    @Override
    public void moveUp() {

        super.moveUp();
    }

    @Override
    public void moveDown() {

        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {

        super.moveRight();
    }

    public void bottomRight() {

    }

    public void topLeft() {


    }

   public static void main(String args[]) {
       MovableRectangle rectangle = new MovableRectangle(2, 5, 8, 9, 8, 8, 4, 4);
       rectangle.moveUp();
       rectangle.moveDown();
       rectangle.moveLeft();
       rectangle.moveRight();
       rectangle.bottomRight();
       rectangle.topLeft();


   }
}
