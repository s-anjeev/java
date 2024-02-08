import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("enter the size of array ");
                    int size = sc.nextInt();
                    int array[] = new int[size];
                    for(int i = 0;i<size;i++){
                        System.out.println("enter element of array ");
                       array[i]=sc.nextInt();
                    }
                    System.out.println("printing element of array");
                for(int j:array){
                    System.out.println(j);
                }
                }
                
    }
}
