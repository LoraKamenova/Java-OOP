package Working_With_Abstraction_Exercise.JediGalaxy.entity;

public class Player extends PlayerEntity {
    public Player(int row, int col) {
        super(row, col);
    }

    public void move(){
        this.row--;
        this.col++;
    }
}
