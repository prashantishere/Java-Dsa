package Patterns;

import java.util.Scanner;

public class HollowRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();   // row
        int n = sc.nextInt();    //column

        for(int i=1; i <=m; i++){
           for(int j=1; j <=n; j++){
               if(i == 1 || i == m || j == 1 || j == n ){
                   System.out.print("* "); // yeh space sirf code ko sunder bnane ke liye aur neeche wale mai space ki galti kie the
               }
               else System.out.print("# "); // isme space ki value toh dhayan se
           }
            System.out.println();
        }
      }

    }
