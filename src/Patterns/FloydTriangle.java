package Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a  = 1;
//        for(int i=1; i<= n; i++){    // flyodTriangle
//            for (int j=1; j<=i; j++){
//                System.out.print(a++ +" ");
//            }
//            System.out.println();
//        }

//       for(int i=1; i<= n; i++){        // BinaryTriangle
//            for (int j=1; j<=i; j++){
//               if((i+j)%2 == 0) System.out.print( "1 ");
//               else System.out.print("0 ");
//            }
//           System.out.println();
//        }

        for(int i=1; i<= n; i++){
            int a=1;                // local and global variable
            for (int j=1; j<=i; j++){

                System.out.print(a +" ");
                a = a+2;
            }
            System.out.println();
        }
    }
}
