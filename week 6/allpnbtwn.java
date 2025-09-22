public class allpnbtwn {
    public static boolean prime(int n)
    {
         boolean isPrime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
            isPrime=false;
            break;
            }    
    }
    return isPrime;
}
public static void main(String[] args) {
    System.out.print("Prime numbers between 1 to 100: \n");
    for(int i=2;i<=100;i++){
    if(prime(i))
    System.out.print(i+"   ");
}
}
}