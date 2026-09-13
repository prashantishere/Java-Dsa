package GUIcalculator;

import java.util.Scanner;

import static Methods.Builtin.add;

public class Frontend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if( op == '+'){
            System.out.print(a + b);
        } else if (op == '-') {
            System.out.print(a - b);
        } else if (op == '*') {
            System.out.print(a * b);
        }
       else if(op == '/'){
            System.out.print(a / b);
        }
        else {
            System.out.print("Invalid operator");
        }

    }
}
