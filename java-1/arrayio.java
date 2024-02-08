import java.util.Scanner;

class arrayio {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.println("enter the size of array:--");
            int size = input.nextInt(); // number of elements we want in array
            int[] number = new int[size]; // declaring array of size size
            for (int i = 0; i < size; i++) {
                System.out.println("enter element " + (i + 1) + ":");
                number[i] = input.nextInt();
            }
            System.out.println("the elements in array are :");
            for (int j = 0; j < number.length; j++) {
                int n = number[j];
                System.out.println(n);
            }
        }
    }
}
