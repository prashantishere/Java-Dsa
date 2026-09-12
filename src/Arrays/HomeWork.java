package Arrays;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
    // multiply by 2 in odd index and add 2  in even index
//
//        int[] arr = {1,2,3,4,5};
//        for(int i=0; i< arr.length; i++){
//            if(i%2==0)
//                arr[i] += 10;
//            else arr[i] *= 2;
//        }
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] +" ");
//        }

        //-----------Q 2----------

        // Search in array that a element is present
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        boolean flag = true;
        for(int i=0; i< arr.length; i++){
            if(arr[i]  == n);
             flag = false;
            break;
        }
       if(flag == false) System.out.println("element is present ");
           else System.out.println("element is not present ");
    }
}
