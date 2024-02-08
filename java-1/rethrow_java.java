public class rethrow_java {
    public static void divide(){
        try {
            int result = 5/0;
            System.out.println("division result = "+result);
        } catch (Exception e) {
            System.out.println("exception whlile defining function "+e.getMessage());
            throw e; //rethrow exception
        }
    }
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("exception whlile calling "+e.getMessage());
        }
    }
}
