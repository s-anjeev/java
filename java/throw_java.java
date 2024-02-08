public class throw_java {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("age cannot be negative");

            }
        } catch (IllegalArgumentException e) {
            System.out.println("exception :" + e.getMessage());
        }
    }
}
