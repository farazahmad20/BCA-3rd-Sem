import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
           while(n>10){
           System.out.println(n);
           n= n/2;
        } 
        sc.close();
    }  
}
