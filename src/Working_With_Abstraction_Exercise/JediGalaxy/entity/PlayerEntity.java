package Working_With_Abstraction_Exercise.JediGalaxy.entity;

public abstract class PlayerEntity {
    int row;
    int col;

    public PlayerEntity(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }
}
