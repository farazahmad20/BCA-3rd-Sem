import java.util.Scanner;
public class biggest{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter 1st num: ");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd num: ");
        int num3=sc.nextInt();
        int largest;
        
            if (num1 >= num2 && num1 >= num3) {
            largest = num1;
         }
            else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
         }
            else {
            largest = num3;
         }
        System.out.println("The largest number is: " + largest);
    }     
       }

