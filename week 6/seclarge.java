import java.util.Scanner;
public class seclarge{
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.print("Enter element " +(i+1)+ ":" );
            a[i]=sc.nextInt();
        }
        System.out.println("Elements of array are: ");
        for(int i=0;i<=n-1;i++){
            System.out.print(a[i]+"  ");
        }
        int largest=a[0];
        int seclargest=Integer.MIN_VALUE;
            for (int i=1;i<n;i++) {
             if (a[i] > largest) {
             seclargest = largest;
             largest = a[i];
         } 
            else if (a[i] > seclargest && a[i] != largest) {
             seclargest = a[i];
         }
    }
    System.out.print("\nSecond largest element is: "+seclargest);
    sc.close();
          }
        }
