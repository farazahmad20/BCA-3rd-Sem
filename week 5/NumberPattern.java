public class NumberPattern {
    public static void main(String[] args) {
        int Rows = 5;
        for (int i = 1; i<=Rows; i++) {
            for (int j = 4; j >=i; j--) {
                System.out.print(" ");   
            }
            for (int k = 1; k <= i; k++) {
                System.out.print( k );   
            }
            System.out.println();
        }
    }
}