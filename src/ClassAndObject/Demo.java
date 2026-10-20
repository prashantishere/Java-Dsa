package ClassAndObject;


class sum {

    static int  add(int n1,int n2, int n3){
        //int result = n1 + n2;
        return n1 + n2 + n3;
    }

}


public class Demo {
    static void main() {
        sum obj = new sum();
        int result = obj.add(5,6,7);
        System.out.println(result);
    }
}
