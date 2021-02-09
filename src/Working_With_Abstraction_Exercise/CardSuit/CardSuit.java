package Working_With_Abstraction_Exercise.CardSuit;

enum CardSuit {

CLUBS(0),DIAMONDS(1),HEARTS(2),SPADES(3);

    public int suit;

    CardSuit(int suit) {
        this.suit = suit;
    }

    public int getValue(){
        return this.suit;
    }

}
