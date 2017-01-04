public class UnCheckedException {
    public static void main(String[] args) {
        System.out.println("Basic Exception Example");
        int x = 10 / 0; // this line will not be checked at compile time but at Runtime it will throw an exception.
        System.out.println(x);// java.lang.ArithmeticException: / by zero - Exception will occur
        System.out.println("This line will not be executed");
    }
}
