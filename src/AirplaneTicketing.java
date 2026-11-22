
import java.util.Scanner;

public class AirplaneTicketing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Airplane seats (20 rows, 2 columns)
        char[][] seats = new char[20][2];

        // Initialize all seats as available
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'O';
            }
        }

        // Set occupied seats
        seats[2][1] = 'X';
        seats[3][0] = 'X';

        int row, column;

        System.out.println("================================");
        System.out.println("     PAPER PLANE NI ANG!");
        System.out.println("================================");

        System.out.println("\nSEAT AVAILABILITY");

        // Display seating arrangement
        System.out.println("\n       A   B");

        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + "  ");

            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + "   ");
            }

            System.out.println();
        }

        System.out.println("\nO = Available");
        System.out.println("X = Occupied");

        System.out.print("\nEnter row number (1-20): ");
        row = scanner.nextInt();

        System.out.print("Enter seat column (1-2): ");
        column = scanner.nextInt();

        if (row >= 1 && row <= 20 &&
                column >= 1 && column <= 2) {

            if (seats[row - 1][column - 1] == 'O') {
                System.out.println("\nAwesome Sauce! Pwede dito!");

            } else {
                System.out.println("\nhala ka ben bawal dito!");
            }

        } else {
            System.out.println("\nanong pinagsasabi mo boi");
        }

        scanner.close();
    }
}
