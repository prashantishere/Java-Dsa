package Bascis;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to check even odd");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("the number is even ");

        else {
            System.out.println("number is odd ");
            System.out.println("hum bracket multiline code ke liye lete hai");
        }
    }
}
