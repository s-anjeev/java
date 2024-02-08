package operators;
import java.util.Scanner;
public class unary {
    public static void main(String[] args) {
        System.out.println("unery operators :-");
        System.out.println("enter one entegers");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            //pre increment
            int b = ++a;  //here we can also use --a
            System.out.println(b);
            //post increment
            int c = a++ ;    // here we can also use a--
            System.out.println(c);
        }
    }
}
