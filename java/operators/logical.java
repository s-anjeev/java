package operators;
import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        System.out.println("logical operators :-");
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("enter your age");
            int a = sc.nextInt();
            System.out.println("enter your hight ");
            int b = sc.nextInt();
            if (a >= 18 && b >= 165) {  //here we can also use || , !
                System.out.println("welcome to hud");
            }
            else{
                System.out.println(" you are not eligible");
            }
        }
    }
}
