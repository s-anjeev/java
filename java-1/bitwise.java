import java.util.Scanner;

public class bitwise {
    public static void main(String args[]) {
        System.out.println("bitwise operator :-");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two entegers ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a >> 2; // here we can also use << >> >>>
            System.out.println(c);
            int d = ~a;
            System.out.println(d);
            int e = a & b; // here we can also use & | ^
            System.out.println(e);
        }
    }
}
