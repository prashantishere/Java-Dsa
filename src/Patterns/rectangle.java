package Patterns;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

//        for (int i=1; i <=m; i++){       // square star
//            for(int j=1; j <=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();

        for (int i=1; i <=m; i++){               // m row and n coloumn

            for(int j=1; j <=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
