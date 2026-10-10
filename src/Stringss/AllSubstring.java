package Stringss;

public class AllSubstring {
    public static void main(String[] args) {
        String s= "gopi";
        for(int i=0; i<=s.length()-1; i++){
            for(int j=s.length(); j>i; j--){
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }

    }
}
