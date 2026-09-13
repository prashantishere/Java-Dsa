package loops;

import java.util.Scanner;

public class ApOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Ap 2 5 8 11 14 17 upto n terms
        for(int i=2; i<= 3*n-1; i+=3){
            System.out.print(i+" " );
        }
    }
}
