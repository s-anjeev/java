import folder.*;
public class java_package{
    public static void main(String[] args) {
        int x = 45;
        int y = 78;
        calculator obj = new calculator();
        int add = obj.add(x,y);
        System.out.println("sum of "+x+" and "+y+" is "+add);
        int sub = obj.sub(x,y);
        System.out.println(x+" minus "+y+" is "+sub);
        int multi = obj.multi(x,y);
        System.out.println(x+" multiply with  "+y+" is "+multi);
        int div = obj.div(x,y);
        System.out.println(x+" divides "+y+" is "+div);
    }
}