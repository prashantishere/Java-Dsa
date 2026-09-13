package Arrays;


import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArray { // add two sorted array
    public static void main(String[] args){

    int[] arr1 = {3, 5, 7, 8};
    int[] arr2 = {4, 5, 6, 8, 9};

        int m = arr1.length;
        int n = arr2.length;
        int carry = 0;

        ArrayList<Integer> arr3 = new ArrayList<>();
        while( m != 0){
            if (arr1[m-1] + arr2[n-1] + carry <= 9) {
                arr3.add (arr1[m-1] + arr2[n-1] + carry);
                carry = 0;

            } else {
                arr3.add((arr1[m-1] + arr2[n-1] + carry) % 10);
                carry = 1;
            }
            m--;
            n--;

        }

            while( n != 0 ) {
                arr3.add( arr2[n-1]);
                n--;
            }

            Collections.reverse(arr3);
            System.out.print(arr3);
    }

}