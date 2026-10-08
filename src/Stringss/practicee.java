package Stringss;

public class practicee {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int maxx =b, minn=a;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
        while (true) {
            if(minn % maxx ==0) {
                System.out.println("lcm is " + minn);
                break;
            }

            minn = minn + a;

        }

    }
}
