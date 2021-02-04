import java.util.Scanner;
public class Shape {

    int number1, number2, number3;
    int largest, smallest;

    public void getUserInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        number3 = input.nextInt();
    }

    public void sum() {
        int sum = number1 + number2 + number3;
        System.out.println("The sum is " + sum);
    }

    public void average() {
        int sum02 = number1 + number2 + number3;
        int average = sum02 / 3;
        System.out.println("The average is " + average);
    }

    public void product() {
        int product = number1 * number2 * number3;
        System.out.println("The product is " + product);
    }

    public void largest() {
        largest = number1;
        if(number2 > largest) {
            largest = number2;
        }
        if(number3 > largest) {
            largest = number3;
        }
        System.out.println("The largest number is " + largest);
    }

    public void smallest() {
        smallest = number1;
        if(number2 < smallest) {
            smallest = number2;
        }
        if(number2 < smallest) {
            smallest = number3;
        }
        System.out.println("The smallest number is " + smallest);
    }
}
