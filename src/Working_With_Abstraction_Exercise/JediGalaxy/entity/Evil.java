package Working_With_Abstraction_Exercise.JediGalaxy.entity;

public class Evil extends PlayerEntity{
    public Evil(int row, int col) {
        super(row, col);
    }

    public void move(){
        this.row--;
        this.col--;
    }
}
