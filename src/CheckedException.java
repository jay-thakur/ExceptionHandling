/**
 * This class demonstrates Checked Exception.
 */
public class CheckedException {
    public static void main(String[] args) {
        System.out.println("this line will be executed");

        //Class.forName("java.lang.string");// this line will be checked by compiler & generate exception as this is not handled because the entered class may or may not be found.
        System.out.println("this line will NOT be executed");

        // Handle this Exception
        try {
            Class.forName("java.lang.string");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception :- Class Not found "+e);
        }

        System.out.println("Now this line will be executed");
    }

}
