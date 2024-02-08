package operators;

public class bit {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("bitwise complement");
        System.out.println(~a);
        System.out.println("bitwise AND");
        System.out.println(a&b);
        System.out.println("bitwise OR");
        System.out.println(a|b);
        System.out.println("bitwise xop");
        System.out.println(a^b);
        System.out.println("bitwise right shift");
        System.out.println(a>>1);
        System.out.println("bitwise left shift");
        System.out.println(a<<1);

    }
}
