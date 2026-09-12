package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();   // row
        int n = sc.nextInt();    //column
//        int mid = m/2 + 1;
//        for(int i=1; i <=m; i++){
//           for(int j=1; j <=n; j++){
//               if(i == mid || j == mid ){
//                   System.out.print("* ");
//               }
//               else System.out.print("  ");
//           }
//            System.out.println();
//        }

        int mid = m/2 + 1;
        for(int i=1; i <=m; i++){
            for(int j=1; j <=n; j++){
                if(i == j || i + j ==6 ){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }



    }
}
