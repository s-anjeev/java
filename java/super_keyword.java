//creating a class name one which is going to serv as a super class
class one{
    int i = 52;
    void show(){
        System.out.println("value of i in super class is "+i);
    }
}
//class two which inharits class one
class two extends one{
    int i =58;
    void show(){
        super.show();
        System.out.println("value of i in sub class is "+i);
    }
}
//main class 
public class super_keyword{
    public static void main(String[] args) {
        two t = new two();
        t.show();
    }
}
