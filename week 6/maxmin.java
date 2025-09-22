import java.util.Scanner;
public class maxmin {
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
        int small=a[0];
        int big=a[0];
        for(int i = 1;i<=n-1;i++){
            if(a[i]>big) {
                big=a[i];
            }
            if(a[i]<small){
                small=a[i];
            }
        }
            System.out.println();
            System.out.print("Biggest element: "+big);
            System.out.println();
            System.out.print("Smallest element: "+small);
            sc.close();
        }
    }

