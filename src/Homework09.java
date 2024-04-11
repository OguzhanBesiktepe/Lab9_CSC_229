/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

    // Method to find divisors count

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

                // Count i as a divisor

                count++;

                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to find the first triangle number with more than 100 divisors

    public static int findTriangleNumber(int divisorLimit) {
        int n = 1;
        while (true) {

            // Generate the nth triangle number

            int triangleNumber = n * (n + 1) / 2;

            // Count the divisors of the triangle number

            int divisorsCount = countDivisors(triangleNumber);

            // Check if the triangle number has more than 'divisorLimit' divisors

            if (divisorsCount > divisorLimit) {
                return triangleNumber;
            }

            // Increment n to get the next triangle number
            n++;
        }
    }

    public static void main(String[] args) {
        // Find the first triangle number with more than 100 divisors
        int result = findTriangleNumber(100);
        System.out.println("The first triangle number with more than 100 divisors is: " + result);
    }
}
