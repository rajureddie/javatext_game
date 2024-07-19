package text_game;
import java.util.Scanner;
public class game {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. Your goal is to find a way out.");

        while (playing) {
            System.out.println("You are at a crossroads. Do you want to go left or right?");
            System.out.println("1. Left");
            System.out.println("2. Right");
            int choice = getValidInput(scanner);

            if (choice == 1) {
                System.out.println("You decide to go left.");
                System.out.println("You encounter a river. Do you want to swim across or walk along the river?");
                System.out.println("1. Swim across");
                System.out.println("2. Walk along the river");
                choice = getValidInput(scanner);

                if (choice == 1) {
                    System.out.println("You try to swim across the river but the current is too strong.");
                    System.out.println("You drown. Game over.");
                    playing = false;
                } else {
                    System.out.println("You walk along the river and find a bridge.");
                    System.out.println("You cross the bridge and find your way out of the forest. You win!");
                    playing = false;
                }

            } else {
                System.out.println("You decide to go right.");
                System.out.println("You encounter a bear. Do you want to fight the bear or run away?");
                System.out.println("1. Fight the bear");
                System.out.println("2. Run away");
                choice = getValidInput(scanner);

                if (choice == 1) {
                    System.out.println("You try to fight the bear but it's too strong.");
                    System.out.println("You get mauled. Game over.");
                    playing = false;
                } else {
                    System.out.println("You run away and find a cave.");
                    System.out.println("You hide in the cave and the bear leaves. You find a hidden path in the cave that leads out of the forest. You win!");
                    playing = false;
                }
            }

            if (!playing) {
                System.out.println("Do you want to play again? (yes/no)");
                String playAgain = scanner.nextLine().trim().toLowerCase();
                if (playAgain.equals("yes")) {
                    playing = true;
                } else {
                    System.out.println("Thank you for playing! Goodbye.");
                }
            }
        }

        scanner.close();
    }

    private static int getValidInput(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice == 1 || choice == 2) {
                    return choice;
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}


