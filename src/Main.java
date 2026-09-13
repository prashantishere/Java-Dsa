public class Main{

    public static long maxProduct(int n) {
        // Base cases (mandatory cut)
        if (n == 2) return 1;  // 1×1
        if (n == 3) return 2;  // 1×2

        long product = 1;
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        // Remaining n ∈ {2, 3, 4} — all optimal to keep as-is
        product *= n;
        return product;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {2, 1}, {3, 2}, {4, 4}, {5, 6},
                {6, 9}, {7, 12}, {8, 18}, {10, 36}, {58, 0}
        };
        long[] expected = {1, 2, 4, 6, 9, 12, 18, 36, 1549681956L};

        for (int i = 0; i < testCases.length; i++) {
            int n = testCases[i][0];
            long result = maxProduct(n);
            String status = result == expected[i] ? "✅" : "❌";
            System.out.printf("%s n=%-2d → %d (expected %d)%n",
                    status, n, result, expected[i]);
        }
    }
}