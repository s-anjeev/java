public class throw_java{
    public static void main(String[] args) {
        try{
            int age = -4;
            if (age<0) {
                throw new IllegalArgumentException("age cannot be negative");
            }
            System.out.println("valid age");
        }catch(IllegalArgumentException E){
            System.out.println("Error: " + E.getMessage());
        }
    }
}
