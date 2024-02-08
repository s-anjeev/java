class one{
    void display(){
        System.out.println("constructor of base class");
    }
}
class two extends one{
    void display(){
        System.out.println("constructor of drived class");
        super.display();
    }
}
public class simple_super {
    public static void main(String[] args) {
        two t = new two();
        t.display();
    }
}
