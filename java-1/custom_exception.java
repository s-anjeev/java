class myexception extends Exception{
    public myexception(String message){
        super(message);
    }
}
public class custom_exception {
    public static void main(String[] args) {
        try {
            int r = 1/0;
            System.out.println(r);
            throw new myexception("custom exception ");
        } catch (myexception e) {
            System.out.println("exception catched "+e.getMessage());
        }
    }
}
