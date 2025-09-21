import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int y= sc.nextInt();
        if (y%400==0)
        System.out.println("It is leap year");
        else if (y%4==0 && y%100!=0)
        System.out.println("It is a leap year");
        else
        System.out.print("Not a leap year!");
        sc.close();
    }
    
}
