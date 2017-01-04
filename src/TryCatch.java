/**
 * Customised Exception Handling using try catch
 */
public class TryCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //Handle the abnormal termination i:e; exception
        try{
            int x = arr[5]; // Risky code means it may raise exception.
            System.out.println("Element at index 5 is : "+x);

            System.out.println("This line will NOT be executed if exception occurs at previous line");
        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Exception :- "+ai);
        }

        System.out.println("Since array index starts from 0 so we can not access index 5 element from arr");
    }
}
