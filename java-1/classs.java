class person {
    String name = "raju";
    int age = 45;
    void talk() {
        System.out.println("my name is " + name);
        System.out.println("my age is " + age);
    }
}

public class classs {
    public static void main(String[] args) {
        person raju = new person();
        raju.talk();
    }
}
