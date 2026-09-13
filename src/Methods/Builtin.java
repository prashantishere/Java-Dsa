package Methods;
public class Builtin {

    // ─── 1. Static Method ─────────────────────────────────────────
    public static int add(int a, int b) {
        return a + b;
    }

    // ─── 6. Recursive Method ──────────────────────────────────────
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }






    
    // ─── 7. Instance Method ───────────────────────────────────────
    public String studentStatus(int marks) {
        if (marks >= 40) return "Pass";
        else return "Fail";
    }

    // ─── 8. Method Using Built-in String Methods ──────────────────
    public static void stringDemo(String s) {
        System.out.println("Original  : " + s);
        System.out.println("Uppercase : " + s.toUpperCase());
        System.out.println("Length    : " + s.length());
        System.out.println("Reversed  : " + new StringBuilder(s).reverse());
    }

    // ─── 9. Method Using Built-in Math Methods ────────────────────
    public static void mathDemo(double num) {
        System.out.println("Number    : " + num);
        System.out.println("Square rt : " + Math.sqrt(num));
        System.out.println("Rounded   : " + Math.round(num));
        System.out.println("Absolute  : " + Math.abs(-num));
    }

    // ─── 10. Method Using Array ───────────────────────────────────
    public static void arrayDemo() {
        int[] marks = {55, 90, 33, 78, 61};
        java.util.Arrays.sort(marks);
        System.out.println("Sorted marks : " + java.util.Arrays.toString(marks));
        System.out.println("Highest mark : " + marks[marks.length - 1]);
        System.out.println("Lowest  mark : " + marks[0]);
    }

    // ─── main Method ──────────────────────────────────────────────
    public static void main(String[] args) {

        System.out.println(" 1. Static Method ");
        System.out.println("Sum = " + add(10, 20));          // 30

//        System.out.println("\n===== 2. Void Method =====");
//        printWelcome("Prashant");                             // Welcome, Prashant!
//
//        System.out.println("\n===== 3. Return Value Method =====");
//        System.out.println("Grade: " + getGrade(85));        // A
//
//        System.out.println("\n===== 4. No Parameter Method =====");
//        showInfo();
//
//        System.out.println("\n===== 5. Overloaded Methods =====");
//        System.out.println("Int multiply   : " + multiply(4, 5));       // 20
//        System.out.println("Double multiply: " + multiply(2.5, 3.0));   // 7.5

        System.out.println("\n 6. Recursive Method");
        System.out.println("Factorial of 5 = " + factorial(5));         // 120

        System.out.println("\n 7. Instance Method =====");
        Builtin obj = new Builtin();
        System.out.println("Status: " + obj.studentStatus(75));         // Pass
        System.out.println("Status: " + obj.studentStatus(30));         // Fail

        System.out.println("\n===== 8. String Built-in Methods =====");
        stringDemo("hello java");

        System.out.println("\n===== 9. Math Built-in Methods =====");
        mathDemo(49.6);

        System.out.println("\n===== 10. Array Built-in Methods =====");
        arrayDemo();
    }
}