package Arrays;

public class practice {
    public static boolean main(String[] args) {
        int[] arr = {4, 5, 2, 1, 7, 8, 20, 46, 37};
        int target = 5;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == target) {
             return true;
                }
            }
        }
      return false;
    }
}