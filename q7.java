import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); 
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt(); 
        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
     if (num1<num2 && num1<num3 && num1<num4)
          System.out.println(num1+" is the smallest");
     else if (num2<num1 && num2<num3 && num2<num4)
          System.out.println(num2+" is the smallest");
     else if (num3<num1 && num3<num2 && num3<num4)
          System.out.println(num3+" is the smallest");
     else
          System.out.println(num4+"is the smallest");
          sc.close();
    }
}
