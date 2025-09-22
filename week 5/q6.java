import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        double fact =1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        System.out.print("Factorial: "+fact);
        sc.close();
    }  
}
