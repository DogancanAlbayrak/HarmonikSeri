import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz: ");// Prompt the user to enter the value of N
        int n = input.nextInt();
        double sum = 0.0;
        // Calculate the harmonic series up to N
        for (double i = 1; i <= n; i++) {
            sum += (1 / i);// Add the reciprocal of each number from 1 to N to the result
        } // Print the result
        System.out.print(sum);
    }
}