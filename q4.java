import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit of series: ");
        int n= sc.nextInt();
        double sum= n*(n+1)/2;
        System.out.println("Sum: "+sum);
        sc.close();
    }    
}
