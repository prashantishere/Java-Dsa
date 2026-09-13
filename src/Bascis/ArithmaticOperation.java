package Bascis;

//public class ArithmaticOperation {
//    public static void main(String[] args) {
//        int x = 5, y = 3;
//        System.out.println(x-y);
//    }
//}

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        switch (n) {

            case 1:  System.out.print("One"); break;
            case 2:  System.out.print("Two"); break;
            case 3:  System.out.print("Three");break;
            case 6:  System.out.print("Six"); break;
            case 7:  System.out.print("Seven"); break;
            case 8:  System.out.print("Eight"); break;
            case 9:  System.out.print("Nine");break;
            default: System.out.print("Unknown");
        }


    }


}