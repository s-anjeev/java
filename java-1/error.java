public class error {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(1 / 0);
        } catch (Exception b) {
            System.out.println("divided by zero");
        } finally {
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
        }

    }
}