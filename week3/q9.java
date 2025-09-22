import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter 1st integer: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd integer : ");
        int b = s.nextInt();
        int quot = (a/b);
        int rem =(a%b);
        System.out.println("Quotient is: "+quot);
        System.out.println("Remainder is : "+rem);
        s.close();
    }
}
