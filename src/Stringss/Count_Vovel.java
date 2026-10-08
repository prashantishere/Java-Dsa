package Stringss;

public class Count_Vovel {
    public static void main(String[] args) {
        String s = "hsdufghisknbliodugreoiaugfukuio";
        int n = s.length();
        int count=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) =='a' || 'e' || 'i' || 'o' || 'u'){
                count++;
            }

        }

        System.out.println(count);
    }
}
