package Working_With_Abstraction_Exercise.CardsWithPower;

enum Suit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    public int suit;

    Suit(int suit) {
        this.suit = suit;
    }

    public int getPower() {
        return this.suit;
    }

}
