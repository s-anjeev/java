public class throws_java {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } 
        System.out.println("output is = "+numerator/denominator);
        return numerator / denominator;
    }

  }
