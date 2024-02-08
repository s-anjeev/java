public class try_catch {
    public static void main(String[] args) {

        try {
            int a = 54;
            int b = 0;
            int c = a / b;
            System.out.println(a + " + " + b + " = " + c);
        } catch (Exception e) {
            System.out.println("an exception accor");
            System.out.println("exception :"+e);
        }
    }
}