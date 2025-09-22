import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many multiples of 10 you want: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * 10;
        }
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}