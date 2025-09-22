 import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (n == 1) {
            System.out.print(first);
        } else {
            System.out.print(first + ", " + second);
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}