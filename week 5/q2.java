import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int sum=0;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements: "+sum);
        sc.close();
    }
}