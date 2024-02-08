interface animal{
   public void sound();
}
class dog implements animal{
   public void sound(){
        System.out.println("woof");
    }
}
class cat implements animal{
    public void sound(){
         System.out.println("meow");
     }
 }
public class java_interface {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.sound();
        c.sound();
    }
}
