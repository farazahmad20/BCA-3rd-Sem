import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[] ={5,7,12,21,2,9};
        int largest=Integer.MIN_VALUE;
        System.out.print("Elements of array are: ");
         for(int i=0;i<=5;i++){
            System.out.print(a[i]+"  ");
         }
        for(int i=0;i<=5;i++){
            if(a[i]>largest)
            largest=a[i];
        }
        System.out.println();
        System.out.println("Largest element is: "+largest);
        sc.close();
    }
}