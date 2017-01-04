/**
 * Customised Exception Handling using try with multiple catch
 */
public class TryMultipleCatch {
    public static void main(String[] args) {
        try{
            int z = 10 / 0;
            System.out.println(" z value is : "+z);
        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Array Index Out Of Bound Exception : "+ai);
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception : "+ae); // Since it generates ArithmeticException so will be caught here.
        }catch (Exception e){
            System.out.println(" Exception : "+e);
        }
    }
}
