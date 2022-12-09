import java.io.*;
public class Test {
    public static void main(String[] args)throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Reading Data using readline
        String name = reader.readLine();
        //Printing the read line
        System.out.println(name);
    }
}
