// Simple Java program that performs Euclidean Algorithm to find GCD
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGCD(int firstInt, int secondInt) {
        if (secondInt == 0) {
            return firstInt;
        }
        // Recursively calls the getGCD function
        return getGCD(secondInt, firstInt % secondInt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int result;

        result = getGCD(firstInt, secondInt);
        System.out.println("GCD: " + result);
    }
}
