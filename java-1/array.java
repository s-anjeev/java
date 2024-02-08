
public class array {
    public static void main(String[] args) {
        /* System.out.println("array of numbers :--");
        int[] numbers = { 1, 5, 45, 75, 8565, 789652, 1, 75 };
        for (int i = 0;i<numbers.length;i++) {
            int n = numbers[i];
            System.out.println(n);
        }
        System.out.println();
        System.out.println("array of strings :--");
        String[] person = {"aarti","shikha","praval", };
        for (String i : person) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("array of charectors :--");
        String[] alpha = {"s","t","g","r","s","f"};
        for (String i : alpha) {
            System.out.println(i);
        } */

        System.out.println("2d array of numbers :--");
        int[][] myNumbers = {{1,2},{3,4},{5,6},{7,8}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.print(myNumbers[i][j]);
            }
            System.out.println();
          }
        }
    }
