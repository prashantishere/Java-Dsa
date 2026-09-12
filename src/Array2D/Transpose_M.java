package Array2D;

public class Transpose_M {
    public static void main(String[] args) {
        int [][]arr = {{1,43,65,3}, {3,5,6,4}, {4,6,7,9}, {7,4,4,5}};

        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){  // addha countning hi krenge kyuki pura pe element repeat hone lge
               int temp = arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
