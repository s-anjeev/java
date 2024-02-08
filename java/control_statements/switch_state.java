package control_statements;

public class switch_state {
    public static void main(String[] args) {
        System.out.println("switch statement : -- ");
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("value of a is 1");
                break;
            case 2:
                System.out.println("value of a is 2");
                break;
            default:
                System.out.println(a);
                break;
        }
    }
}
