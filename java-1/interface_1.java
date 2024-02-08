interface area{
   final static float pi = 3.14f;
   double compute(double x);
}
class circle implements area{
    public double compute(double x){
        return (pi*(x*x));
    }
}
public class interface_1 {
    public static void main(String[] args) {
        circle c = new circle();
        area area;
        area = c;
        System.out.println("area of circle is = "+area.compute(5));
    }
}
