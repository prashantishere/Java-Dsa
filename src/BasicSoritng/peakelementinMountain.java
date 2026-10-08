package BasicSoritng;

public class peakelementinMountain {
    public static void main(String[] args) {
        int []arr = {-1,0,1,2,5,6,68,112,6,3,};
        int lo=0, hi =8;

        while(lo <= hi){
            int mid= (lo+hi)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid +1;
            else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) hi = mid-1;
        }
    }
}
