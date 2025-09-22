import java.util.Scanner;
public class linearsearch {
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
        int key;
        System.out.print("\nEnter your key: ");
        key=sc.nextInt();
        int index=-1;
        for(int i=0;i<=n-1;i++){
            if(key==a[i]){
            index=i;
            break;
        }
        }
        if (index!= -1 )
            System.out.print("Found at  Index "+index);
        else
            System.out.print("Not Found");
        sc.close();
        
    }
}