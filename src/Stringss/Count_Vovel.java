package Stringss;

public class Count_Vovel {
    public static void main(String[] args) {
        String s = "hsdufghisknbliodugreoiaugfukuio";
        int n = s.length();
        int count=0;
        for(int i=0; i<n; i++){
             char ch = s.charAt(i); // this function ckeck the letter at the location
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

        }

        System.out.println(count);
    }
}
