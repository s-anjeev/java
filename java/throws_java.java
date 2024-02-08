public class throws_java {
    public static int func(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        try {
            int result = func(12, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
