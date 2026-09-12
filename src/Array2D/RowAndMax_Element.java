package Array2D;

public class RowAndMax_Element {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4,5}, {3,4,8,6}, {4,5,2,3}, {5,6,8,9}};
       int max =0;
       int count =-1;
        for(int i=0; i< arr.length; i++){
            int sum = 0;
            for(int j=0; j < arr[0].length; j++){
               sum += arr[i][j];
            }
            if(sum > max) {    // max = Math.(max,sum);
                max = sum;
                 count = i;
            }
        }
        System.out.print(max +" "+ count);
    }
}
