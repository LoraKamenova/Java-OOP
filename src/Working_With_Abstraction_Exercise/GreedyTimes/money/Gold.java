package Working_With_Abstraction_Exercise.GreedyTimes.money;

public class Gold extends Money {
    public Gold(long price) {
        super(price);
    }

    @Override
    public String toString() {
        return String.format("##Gold - %s", this.price);
    }

}
