package Array2D;

public class degree90rotate {
    public static void main(String[] args) {
        int n = 99;
        int sum=0; int mul=1;
        while( n > 0){
            n = n % 10;
             sum = sum + n;
             mul = mul * n ;
             n = n / 10;
        }

        System.out.print(sum );
    }


}
