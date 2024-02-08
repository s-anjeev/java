package operators;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        System.out.println("assignment operator :-");
        System.out.println("enter two entegers ");
        try (Scanner sc = new Scanner(System.in);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b += a;               // here we can also use -=, *=, /=, %=, ^=, =
            System.out.println(b);
        }
    }
}
