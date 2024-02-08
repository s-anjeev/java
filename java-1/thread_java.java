class a extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("i = "+i);
        }
        System.out.println("exit from a");
    }
}
class b extends Thread{
    public void run(){
        for(int j=0;j<=5;j++){
            System.out.println("j = "+j);
        }
        System.out.println("exit from b");
    }
}
class c extends Thread{
    public void run(){
        for(int k=0;k<=5;k++){
            System.out.println("k = "+k);
        }
        System.out.println("exit from c");
    }
}
public class thread_java {
    public static void main(String[] args) {
        new a().start();
        new b().start();
        new c().start();
    }
}
