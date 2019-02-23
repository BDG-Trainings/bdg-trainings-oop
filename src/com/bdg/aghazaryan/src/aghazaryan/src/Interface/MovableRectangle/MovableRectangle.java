package com.bdg.aghazaryan.src.aghazaryan.src.Interface.MovableRectangle;

public class MovableRectangle extends MovablePoint implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed, MovablePoint topLeft,
                            MovablePoint bottomRight) {
        super(x1, y1, x2, y2, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

        topLeft = new MovablePoint (5, 2, 6, 5, 6,5);
        bottomRight = new MovablePoint (5,2,6, 5,6,5);

    }

    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
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

    public static void main(String args[]) {
        MovableRectangle rectangle = new MovableRectangle(6,5,8,9,10,8, 5,5);
        System.out.println(rectangle.topLeft);
        System.out.println(rectangle.bottomRight);



    }

}

