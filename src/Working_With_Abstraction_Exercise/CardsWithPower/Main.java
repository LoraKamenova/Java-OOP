package Working_With_Abstraction_Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rank rank = Rank.valueOf(scanner.nextLine());
        Suit suit = Suit.valueOf(scanner.nextLine());

        Card card = new Card(rank, suit);

        System.out.println(card);
    }
}
