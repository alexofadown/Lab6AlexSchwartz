import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        double sideOne = 0;
        double sideTwo = 0;
        double area;
        double perimeter;
        double hypotenuse;
        boolean sideOneGood = false;
        boolean sideTwoGood = false;

        //input for the first side
        do {
            System.out.println("Enter the length of the first perpendicular side of your garden in meters.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
            }
            else {
                sideOne = scan.nextDouble();
                if (sideOne <= 0) {
                    System.out.println("You entered a number that was 0 or lower. Please try again.");
                }
                else {
                    sideOneGood = true;
                }
            }
            scan.nextLine();
        } while (!sideOneGood);

        //input for the other side
        do {
            System.out.println("Enter the length of the second perpendicular side of your garden in meters.");
            if (!scan.hasNextDouble()) {
                System.out.println("You entered a string. Please try again.");
            }
            else {
                sideTwo = scan.nextDouble();
                if (sideTwo <= 0) {
                    System.out.println("You entered a number that was 0 or lower. Please try again.");
                }
                else {
                    sideTwoGood = true;
                }
            }
            scan.nextLine();
        } while (!sideTwoGood);

        //outputs of side lengths, perimeter, area, hypotenuse, etc
        hypotenuse = Math.hypot(sideOne, sideTwo);
        perimeter = (sideOne + sideTwo + hypotenuse);
        area = sideOne * sideTwo * 0.5;
        System.out.printf("\nFirst side: %1.2f m", sideOne);
        System.out.printf("\nSecond side: %1.2f m", sideTwo);
        System.out.printf("\nLine connecting the two sides: %1.2f m", hypotenuse);
        System.out.printf("\nPerimeter: %1.2f m", perimeter);
        System.out.printf("\nArea: %1.2f m²", area);
    }
}