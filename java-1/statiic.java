class test{
   int x = 30; //instance variable
   //static int x = 30; //static variable
    void display(){
        System.out.println(x);
    }
}
class statiic{
    public static void main(String[] args) {
        test a,b;
        a=new test();
        b= new test();
        ++a.x;
        System.out.println("x in a");
        a.display();
        System.out.println("x in b");
        b.display();
    }
}
