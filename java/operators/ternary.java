package operators;
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        System.out.println("ternay operators :-");
        System.out.println("enter two entegers");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = (a > b)?a:b;
            System.out.println(sum);
        }
    }
}
