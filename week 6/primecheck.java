import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean isPrime = true ;
        if(n<=1){
            isPrime=false;
        }
        else{
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
            isPrime=false;
         break; 
        }
    }
        if(isPrime)
        System.out.print(+n+ " is a prime number!");
        else
        System.out.print(+n+" is not a prime number!");
        sc.close();
    }
    }
}
