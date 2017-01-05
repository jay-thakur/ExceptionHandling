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

        System.out.println("********** finally uses **********");
        /**
         * finally - a block always associated with try catch / try or catch to clean up code.
         * it will be executed always irrespective of whether exception is raised or not, handed or not.
         */

        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Exception : "+ai);
        }finally {
            System.out.println("Clean up the code associated in try block \n This block will be always executed");
        }

    }
}
