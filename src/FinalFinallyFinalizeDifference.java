/**
 * this class will demonstrate difference and how to use final finally & finalize.
 */
public class FinalFinallyFinalizeDifference {
    public static void main(String[] args) {
        System.out.println("final uses ---");
        /**
         * final  - a modifier applicable for classes, methods and variables
         * final class - we can't extend that class i:e; we cant create child class for that class means inheritance is not possible for final classes.
         * final methods - we can't override that method in the child class.
         * final variable - reassignment for that variable cann't be done.
         */
        // here we will see only final variable uses.
        final int x = 10;
        //x = 20; // Compile time error because can't re-assign a value to a final variable
        System.out.println("value of x is : "+x);


    }
}
