import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println("Factors are: ");
        System.out.println(1);
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            System.out.println(i);
        }
        System.out.println(n);
        sc.close();
    }    
}
