public class method_overloading {
    void display() {
        System.out.println("function overloading");
    }
    void display(int a) {
        System.out.println("a = "+a);
    }
    void display(String s) {
        System.out.println("s = "+s);
    }

    public static void main(String[] args) {
        method_overloading m = new method_overloading();
        m.display();
        m.display(45);
        m.display("string");
        }
}
