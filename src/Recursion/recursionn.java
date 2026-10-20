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
        String n = sc.nextLine();

        for(int i=0; i<n.length()-1; i++){
            if(n.charAt(i) == ' ') System.out.println("space detected"+ i);
        }
        //sum(n);
    }
}
