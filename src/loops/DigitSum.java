package loops;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int a;
        while(n != 0){
            a = n%10;
            n = n/10;
            sum = sum +a;
        }
        System.out.println(sum);
    }
}
