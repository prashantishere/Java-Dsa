package If_Else1;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ente number ");
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println(n);
        } else {
            System.out.println(n * -1);  // System.out.println(-n); yeh bhi sahi hai
        }
    }

}
