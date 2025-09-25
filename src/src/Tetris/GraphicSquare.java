package Tetris;

import Coordinates.Point;

public class GraphicSquare {
    int color;
    Boolean isBackground;
    Point point;

    public GraphicSquare(int c, int i, int j){
        this.color = c;
        this.point = new Point(i,j);
        this.isBackground = false;
    }

    public GraphicSquare(Boolean x){
        if(x){
            this.isBackground = true;
        }
    }

    public int getColor() {
        return color;
    }

    public Point getPoint() {
        return point;
    }
}
