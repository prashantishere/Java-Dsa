
package JAVA_BACKEND;
import java.util.Scanner;
public class InputAndoutput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("my name is "+name+" maurya");

        System.out.println("what is your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is fav food?");
        String food = scanner.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(food);

    }
}
