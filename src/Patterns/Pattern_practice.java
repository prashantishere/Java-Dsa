package Patterns;

import java.util.Scanner;

public class Pattern_practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // * * * *
        int sqn = sc.nextInt();


        //-----star rectangle -------
//
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col =sc.nextInt();
//
//        for(int i=0; i< row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        ------- square rectangle----



        //--------aaaBBBcccDDD
//        Scanner sc = new Scanner(System.in);
//        int sqn = sc.nextInt();
//
//        for(int i=1; i<= sqn; i++){
//            for(int j=1; j<=sqn; j++){
//                if(i%2 ==0)System.out.print((char)(i+64) +" ");
//                else System.out.print((char)(i+96) +" ");
//            }
//            System.out.println();
//        }

 //     ---------Rectangle
//        Scanner sc = new Scanner(System.in);  // *
//        int sqn = sc.nextInt();               // * *
//                                              // * * *
//        for(int i=0; i<= sqn; i++){
//            for(int j=0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //++++++++++ this is not the standard case ++++++++ wanna know
        // print number with this
//        Scanner sc = new Scanner(System.in);  // * * * *
//        int sqn = sc.nextInt();               // * * *
//                                              // * *
//        for(int i=sqn; i>= 0; i--){           // *
//            for(int j=0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i=sqn; i>= 0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
