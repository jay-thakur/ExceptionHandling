public class UnCheckedException {
    public static void main(String[] args) {
        System.out.println("This line will be executed");
        /*int x = 10 / 0; // this line will not be checked at compile time but at Runtime it will throw an exception.
        System.out.println(x);// java.lang.ArithmeticException: / by zero - Exception will occur
        System.out.println("This line will not be executed");*/

        // Handle this UnChecked Exception as -
        try{
            int x = 10 / 0;
            System.out.println(x);
        }catch (ArithmeticException ae){
            System.out.println("Exception :- "+ae);
        }

        System.out.println("Now This line will be executed");
    }
}
