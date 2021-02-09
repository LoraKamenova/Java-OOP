package Working_With_Abstraction_Exercise.CardRank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input + ":");
        for (CardRank s : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", s.getRank(), s);
        }

    }
}
