import java.util.Scanner;

public class Task2 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        double chargesAvailable = 0;
        double minutesPerCharge = 0;
        double costToRecharge = 0;
        double totalAvailableMinutes;
        double oneHourCost;
        boolean chargesGood = false;
        boolean minutesGood = false;
        boolean costGood = false;

        //input for number of full battery charges available, loops if bad input
        do {
            System.out.println("Enter the number of full battery charges available.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
                scan.nextLine();
            }
            else {
                chargesAvailable = scan.nextDouble();
                if (chargesAvailable < 0) {
                    System.out.println("You entered a negative number. Please try again.");
                    scan.nextLine();
                } else {
                    chargesGood = true;
                    scan.nextLine();
                }
            }
        } while (!chargesGood);

        //input for number of minutes per full charge available, loops if bad input
        do {
            System.out.println("Enter the number of minutes of robot operation per full battery charge.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
                scan.nextLine();
            }
            else {
                minutesPerCharge = scan.nextDouble();
                if (minutesPerCharge <= 0) {
                    System.out.println("You entered a negative number/zero. Please try again.");
                    scan.nextLine();
                } else {
                    minutesGood = true;
                    scan.nextLine();
                }
            }
        } while (!minutesGood);

        do {
            System.out.println("Enter the number cost to fully recharge a battery.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
                scan.nextLine();
            }
            else {
                costToRecharge = scan.nextDouble();
                if (costToRecharge <= 0) {
                    System.out.println("You entered a negative number/zero. Please try again.");
                    scan.nextLine();
                } else {
                    costGood = true;
                    scan.nextLine();
                }
            }
        } while (!costGood);

        totalAvailableMinutes = chargesAvailable * minutesPerCharge;
        oneHourCost = costToRecharge / minutesPerCharge * 60;

        System.out.printf("%-9s %-1.2f ", "Total available minutes:", totalAvailableMinutes);
        System.out.printf("\n%9s $%1.2f ", "Total cost to run for an hour:", oneHourCost);

    }
}
