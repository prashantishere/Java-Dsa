package BasicSoritng;

public class DescendingBinary {
    public static void main(String[] args){
        int[] arr ={100,91,87,76,66,52,43,35,29,13,5};
         int lo=0, hi= arr.length-1;
         int tar=29;
          while(lo <= hi){
              int mid = (lo+hi)/2;
              if(arr[mid] == tar) {
                  System.out.print(arr[mid]);
                  break;
              }
              else if (arr[mid] > tar) lo = mid + 1;
              else if(arr[mid] < tar) hi = mid-1;

          }
    }
}
