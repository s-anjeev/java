//creating a class name one which is going to serv as a super class
class one{
    void show(){
        System.out.println("super class method");
    }
}
//class two which inharits class one++
class two extends one{
    void show(){
        System.out.println("sub class mrthod");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        one o = new one();
        o.show();
        two t = new two();
        t.show();
    }
}
