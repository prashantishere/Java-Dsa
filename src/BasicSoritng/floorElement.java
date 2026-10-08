package BasicSoritng;

public class floorElement {
    public static void main(String[] args) {
        int []arr={1,2,4,10,10,12,19};
        int x=5;
        int lo=0;
        int hi = arr.length;
        while(lo <= hi){
            int mid = (lo +hi)/2;
            if (arr[mid] >= x) lo = mid+1;
            else if (arr[mid] > x) hi = mid - 1;

        }

    }
}
