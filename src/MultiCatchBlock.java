/**
 * A catch block which can handle multiple Exception
 * this is included in java 7.
 * Note :- in catch block there should not be parent child/child parent/same type relation in exception.
 * ex - catch(ArithmeticException | Exception e){
 *     this will give us compile time error.
 * }
 */
public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
        }catch (ArithmeticException | NullPointerException exception){
            System.out.println("Exception Occured ....."+exception);
        }
    }
}
