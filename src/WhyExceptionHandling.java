
/**
 * this is a simple basic program which explains why do we need to handle exception ?.
 */

public class WhyExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Basic Exception Example");
        int x = 25 / 0;
        System.out.println(x);// java.lang.ArithmeticException: / by zero - Exception will occur
        System.out.println("This line will not be executed");
    }
}
