import java.util.Scanner;
import java.lang.Math;

public class Colorgame {
    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);

        // Variables
        String userColor1;
        String userColor2;
        String userColor3;

        int userBet;
        int userWinnings = 0;

        // All 6 colors
        String[] colors = {"red", "green", "blue", "yellow", "white", "pink"};

        // Start of color game
        System.out.println("----- Color Game -----");

        // Player's input
        // Color 1
        System.out.print("Color 1: ");
        userColor1 = input.nextLine().trim().toLowerCase();

        // Color 2
        System.out.print("Color 2: ");
        userColor2 = input.nextLine().trim().toLowerCase();

        // Color 3
        System.out.print("Color 3: ");
        userColor3 = input.nextLine().trim().toLowerCase();

        // Bet (loop until the user input is correct)
        do {
            System.out.print("Bet (0-20): ");
            userBet = input.nextInt();
        } while (userBet < 0 || userBet > 20);

        // Random color calls
        int color1 = (int)(Math.random() * colors.length);
        int color2 = (int)(Math.random() * colors.length);
        int color3 = (int)(Math.random() * colors.length);

        // Colors to match
        System.out.println("\n----- Colors -----");
        System.out.println("[*] Color 1: " + colors[color1]);
        System.out.println("[*] Color 2: " + colors[color2]);
        System.out.println("[*] Color 3: " + colors[color3]);

        System.out.println("\n----- Result -----");
        // Color 1
        switch (color1) {
            case 0:
                if (userColor1.equals(colors[0])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;
            case 1:
                if (userColor1.equals(colors[1])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;
            case 2:
                if (userColor1.equals(colors[2])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;
            case 3:
                if (userColor1.equals(colors[3])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;
            case 4:
                if (userColor1.equals(colors[4])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;
            case 5:
                if (userColor1.equals(colors[5])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 1 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 1 did not match!");
                }
                break;

            default:
                System.out.println("None of the above.");
        }

        // Color 2
        switch (color2) {
            case 0:
                if (userColor2.equals(colors[0])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;
            case 1:
                if (userColor2.equals(colors[1])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;
            case 2:
                if (userColor2.equals(colors[2])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;
            case 3:
                if (userColor2.equals(colors[3])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;
            case 4:
                if (userColor2.equals(colors[4])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;
            case 5:
                if (userColor2.equals(colors[5])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 2 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 2 did not match!");
                }
                break;

            default:
                System.out.println("None of the above.");
        }

        // Color 3
        switch (color3) {
            case 0:
                if (userColor3.equals(colors[0])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;
            case 1:
                if (userColor3.equals(colors[1])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;
            case 2:
                if (userColor3.equals(colors[2])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;
            case 3:
                if (userColor3.equals(colors[3])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;
            case 4:
                if (userColor3.equals(colors[4])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;
            case 5:
                if (userColor3.equals(colors[5])) {
                    userWinnings += userBet * 2;
                    System.out.println("Color 3 Match! You won: " + (userBet * 2));
                } else {
                    System.out.println("Color 3 did not match!");
                }
                break;

            default:
                System.out.println("None of the above.");
        }

        // Winnings
        System.out.println("\n----- Player's Status -----");
        System.out.println("[*] Total Winnings: " + userWinnings);

        input.close();

    }
}
