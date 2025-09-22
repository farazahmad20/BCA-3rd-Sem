import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the max limit: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i=1;i<=n;i++){
            sum=sum + (1.0/i);
        }
        System.out.print("Sum of the series is: "+sum);
        sc.close();
    }
}