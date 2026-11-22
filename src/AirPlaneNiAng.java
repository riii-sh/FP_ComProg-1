import java.util.Scanner;

    public class AirPlaneNiAng {
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

            int choice;

            do {
                System.out.println("\n================================");
                System.out.println("       PAPER PLANE NI ANG!");
                System.out.println("================================");
                System.out.println("[1] Book a Seat");
                System.out.println("[2] Cancel Booking");
                System.out.println("[3] Search / Check Seat");
                System.out.println("[4] Display All Booked Seats");
                System.out.println("[5] Generate Summary Report");
                System.out.println("[6] Exit");
                System.out.println("================================");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        // Book a Seat
                        System.out.println("\nBOOK A SEAT");
                        break;

                    case 2:
                        // Cancel Booking
                        System.out.println("\nCANCEL BOOKING");
                        break;

                    case 3:
                        // Search / Check Seat

                        int row, column;

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

                        break;

                    case 4:
                        // Display All Booked Seats
                        System.out.println("\nDISPLAY ALL BOOKED SEATS");
                        break;

                    case 5:
                        // Generate Summary Report
                        System.out.println("\nGENERATE SUMMARY REPORT");
                        break;

                    case 6:
                        System.out.println("\nThank you for using Paper Plane Ni Ang!");
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("\nInvalid choice! Please select 1-6.");
                        break;
                }

            } while (choice != 6);

            scanner.close();
        }
    }

