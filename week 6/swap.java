import java.util.Scanner;
public class swap {
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

        int temp;
        temp=a[0];
        a[0]=a[n-1];
        a[n-1]=temp;
        System.out.println();
        System.out.println("Array after swapping: ");
         for(int i=0;i<=n-1;i++){
            System.out.print(a[i]+"  ");
        }
        sc.close();
    } 
}