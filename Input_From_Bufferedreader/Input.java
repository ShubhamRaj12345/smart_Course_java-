package Input_From_Bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// ye try catch me likhana hota hai
public class Input {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String atr = buffer.readLine();
        System.out.println("Name is "+atr);

        System.out.println("Enter your age ");
        int b =Integer.parseInt(buffer.readLine());

        System.out.println("Age"+b);

        System.out.println("Enter your CGPA");

        float f = Float.parseFloat(buffer.readLine());
        System.out.println("CGPA IS "+f);
    }
}
