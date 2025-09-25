package Tetris;

public class Tile {
    boolean isOccupied;
    int color;

    public Tile(boolean b){
        this.isOccupied = false;
        this.color = -1;
    }

    public void setColor(int c){
        if((c > 0 && c < 8) || c == -1) {
            this.color = c;
        }
    }
}
