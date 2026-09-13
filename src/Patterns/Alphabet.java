package Patterns;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {  // A BB CCC
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(i+64) +" ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= n; i++) {  // A AB ABC
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(j+64) +" ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((j%2) == 0){
                    for(j=1; j <=i; j++)System.out.print((char)(j+64) +" ");  // TypeCasting isko use kr kr hum abcd print kr skte
                }
                else for(j=1; j <=i; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
