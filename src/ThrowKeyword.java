/**
 * this class will demonstrate how to use throw keyword
 * throw keyword is used to throw exception explicitly.
 * Generally used for user defined exception.
 */
public class ThrowKeyword {
    public static void main(String[] args) {
        throw new ArithmeticException("Explicit Exception : / by zero");
        //System.out.println("this line in unreachable & will not be executed"); // compile time error - unreachable statement
    }
}
