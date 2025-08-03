import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an empty array of size 5
        int[] numbers = new int[5];

        // Step 2: Ask the user to fill it
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); // store the number in the array
        }

        // Step 3: Print all numbers
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}