package Coordinates;

public class Point {
    int x;
    int y;

    public Point(int i, int j){
        this.x = i;
        this.y = j;
    }

    public int getX(){
        return(this.x);
    }

    public int getY(){
        return(this.y);
    }

    public void setPoint(int i, int j){
        this.x = i;
        this.y = j;
    }

    public void moveUp(int i){
        this.y += i;
    }

    public void moveDown(int i){
        this.y -= i;
    }

    public void moveLeft(int i){
        this.x -= i;
    }

    public void moveRight(int i){
        this.x += i;
    }

    public String toString() {
        return("[" + this.x + ", " + this.y + "]");
    }
}
