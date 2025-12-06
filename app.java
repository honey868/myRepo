import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        input.close();
    }
}

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
