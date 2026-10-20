package Stringss;

public class AllSubstring {
    public static void main(String[] args) {
        String s= "545476";
        for(int i=0; i<=s.length()-1; i++){
            for(int j=i; j<s.length()+1; j++){
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }

    }
}
// -----Sum of all substring of a number
// one concept is when you typecast a string into integer then you cant give a empty string to
// int n = Integer.parseInt(str);


//public static int sumSubstrings(String s) {
//    // code here
//    int sum=0;
//    for(int i=0; i<s.length(); i++){
//        for(int j=i; j<s.length()+1; j++){
//            String ch = s.substring(i,j);
//            //int value = Integer.parseInt( ch);
//            int value = !ch.isEmpty() ? Integer.parseInt(ch) : 0;
//            sum= sum + value;
//        }
//
//    }
//    return sum;
//}