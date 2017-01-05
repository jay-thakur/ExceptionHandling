/**
 * this class demonstrates use of throws keyword
 * if the programmer does not want to handle exception using try catch block, then he should use throws keyword.
 * throws keyword is mainly used for checked exception
 */
public class ThrowsKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("java.lang.string"); // here we don't want to handle exception using try catch so we have to use throws keyword with Exception type.
        System.out.println("this line will NOT be executed"); //since jvm caught exception at line 8 so program terminates abnormally.
    }
}
