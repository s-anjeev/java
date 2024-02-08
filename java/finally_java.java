public class finally_java {
    public static int sum(){
        try {
            int a = 554;
            int b = 45;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("an exception accor");
            System.out.println("exception :"+e);
        }finally{
            System.out.println("finally block executed ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }
}