package operators;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        System.out.println("arithmatic operators :-");
        System.out.println("enter two entegers ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;              //here we can also use other arithmatic operators like - / % *.
            System.out.println(c);
        }
    }
}
