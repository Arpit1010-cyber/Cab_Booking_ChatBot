
import java.util.Scanner;
import java.util.Random;

public class CabBookingChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            // Main Menu
            System.out.println("\n===== CAB BOOKING CHATBOT =====");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            // Exit option
            if (choice == 2) {
                System.out.println("Thank you for using Cab Booking Chatbot!");
                System.out.println("Goodbye!");
                break;
            }

            // Book Ride option
            else if (choice == 1) {

                // Choose Cab Type
                System.out.println("\n----- Choose Cab Type -----");
                System.out.println("1. Auto - Rs.12/km");
                System.out.println("2. Sedan - Rs.18/km");
                System.out.println("3. SUV - Rs.25/km");
                System.out.print("Enter cab choice: ");

                int cabChoice = sc.nextInt();

                String cabType;
                int rate;

                if (cabChoice == 1) {
                    cabType = "Auto";
                    rate = 12;
                }
                else if (cabChoice == 2) {
                    cabType = "Sedan";
                    rate = 18;
                }
                else if (cabChoice == 3) {
                    cabType = "SUV";
                    rate = 25;
                }
                else {
                    System.out.println("Invalid cab choice!");
                    continue;
                }

                // Choose Route
                System.out.println("\n----- Choose Route -----");
                System.out.println("1. Pune Station to Shivajinagar (5 km)");
                System.out.println("2. Swargate to Kothrud (8 km)");
                System.out.println("3. Hinjawadi to Wakad (10 km)");
                System.out.print("Enter route choice: ");

                int routeChoice = sc.nextInt();

                String source;
                String destination;
                int distance;

                if (routeChoice == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                }
                else if (routeChoice == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                }
                else if (routeChoice == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                }
                else {
                    System.out.println("Invalid route choice!");
                    continue;
                }

                // Calculate Fare
                int fare = rate * distance;

                System.out.println("\n===== RIDE DETAILS =====");
                System.out.println("Cab Type    : " + cabType);
                System.out.println("Source      : " + source);
                System.out.println("Destination : " + destination);
                System.out.println("Distance    : " + distance + " km");
                System.out.println("Rate        : Rs." + rate + "/km");
                System.out.println("Total Fare  : Rs." + fare);

                // Confirm or Cancel Booking
                System.out.println("\n----- Booking Confirmation -----");
                System.out.println("1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter your choice: ");

                int confirmChoice = sc.nextInt();

                if (confirmChoice == 2) {
                    System.out.println("Your ride has been cancelled.");
                    System.out.println("No OTP has been shared.");
                    continue;
                }

                else if (confirmChoice == 1) {

                    // Generate 4-digit OTP
                    int otp = 1000 + random.nextInt(9000);

                    System.out.println("\nYour OTP is: " + otp);
                    System.out.println("OTP has been shared successfully.");

                    System.out.println("Booking Confirmed!");
                    System.out.println("IMPORTANT: Once OTP is shared,");
                    System.out.println("the ride cannot be cancelled.");

                }

                else {
                    System.out.println("Invalid confirmation choice!");
                    System.out.println("Returning to main menu.");
                }

            }

            else {
                System.out.println("Invalid menu choice! Please try again.");
            }
        }

        sc.close();
    }
}
