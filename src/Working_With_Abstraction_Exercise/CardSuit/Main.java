package Working_With_Abstraction_Exercise.CardSuit;

import java.util.Scanner;

public class Main {
//Card Suits:
//Ordinal value: 0; Name value: CLUBS
//Ordinal value: 1; Name value: DIAMONDS
//Ordinal value: 2; Name value: HEARTS
//Ordinal value: 3; Name value: SPADES
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input + ":");
        for (CardSuit s : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", s.getValue(), s);
        }

    }
}
