package Tetris;

import Coordinates.Point;

public class Block {
    int shape;
    GraphicSquare[] tiles;
    Point[] points;
    int xOrigin;
    int yOrigin;

    public Block(int s, int x, int y){
        this.xOrigin = x;
        this.yOrigin = y;
        this.shape = s;
        switch(this.shape) {
            case 1:
                //2x2 block
                break;
            case 2:
                //1x4 line
                break;
            case 3:
                // T
                break;
            case 4:
                // L
                break;
            case 5:
                // _| (backwards L)
                break;
            case 6:
                // S
                break;
            case 7:
                // Z
                break;
            default:
                break;
        }

        }

    public void rotateRight() {
        if (this.shape != 1) {
            for (Point p : points) {
                p.setPoint(p.getY(), p.getX() * -1);
            }
        }
    }
    public void rotateLeft() {
        if (this.shape != 1) {
            for (Point p : points) {
                p.setPoint(p.getY() * -1, p.getX());
            }
        }
    }
    public void moveDown() {
        for (Point p : points) {
            p.moveDown(1);
        }
    }
    public void moveLeft() {
        for (Point p : points) {
            p.moveLeft(1);
        }
    }
    public void moveRight() {
        for (Point p : points) {
            p.moveRight(1);
        }
    }



}