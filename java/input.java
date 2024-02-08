import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("taking input from keyboard");
            System.out.println("enter a integer\n");
            int a = sc.nextInt();
            System.out.println(a);
            System.out.println("enter a float value \n");
            float b = sc.nextFloat();
            System.out.println(b);
            System.out.println("enter a sting \n");
            String c = sc.next();
            System.out.println(c);
            System.out.println("enter a line of strings \n");
            String str = sc.nextLine();
            System.out.println(str);

        }
    }
}
