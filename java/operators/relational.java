package operators;

import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        System.out.println("reletional operators :-");
        System.out.println("enter two entegers");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) { // her we can also use < , == ,!= , <=, >=
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        }
    }
}
