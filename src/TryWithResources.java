import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try with resources is used for automatic resource management
 * in this example we don't require to call br.close().
 * we can open multiple resources also seperating by comma.
 * this is included in java 7
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("c:\\text.txt"))){
            String str = null;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException ie){
            System.out.println("Exception Occured.......");
        }
    }
}
