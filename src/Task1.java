import java.util.Scanner;

public class Task1 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        double distanceKilometers = 0;
        double distanceMiles;
        boolean kilometersGood = false;

        //input for kilometers, loops if bad input
        do {
            System.out.println("Enter the number of kilometers you want to convert to miles.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
            }
            else {
                distanceKilometers = scan.nextDouble();
                if (distanceKilometers < 0) {
                    System.out.println("You entered a negative number. Please try again.");
                }
                else {
                    kilometersGood = true;
                }
            }
            scan.nextLine();
        } while (!kilometersGood);

        distanceMiles = distanceKilometers / 1.609;
        System.out.printf("%-9s %-1.2f %9s %1.2f", "Kilometers:", distanceKilometers, "Miles:", distanceMiles);

    }
}
