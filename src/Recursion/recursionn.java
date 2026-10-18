import java.util.Scanner;

public class recursionn {


    static void sum(int n){
        if(n==0) return;
        System.out.println("Peanut");
        sum(n-1);
    }

    static void main() {
        System.out.println("enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //sum(n);
    }
}
