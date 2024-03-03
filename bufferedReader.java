import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Enter Name");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = "John Doe";
        try {
             name = bufferedReader.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            if (name == null) {
                System.out.println(name);
            }
            e.printStackTrace();
        }
        System.out.println(name);
        try {
            bufferedReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}