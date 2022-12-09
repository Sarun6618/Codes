import java.io.*;
import java.util.*;

class shiviva {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fin = new FileReader("one.txt");
        FileWriter fout = new FileWriter("two.txt", true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        fin.close();
        fout.close();
        sc.close();
    }
}