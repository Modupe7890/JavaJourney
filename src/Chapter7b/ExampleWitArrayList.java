package Chapter7b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ExampleWitArrayList {
    public static void main(String[] args) {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //Read Strings from the keyboard
        ArrayList&ltString> list = new ArrayList&ltString>();

        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        // Display the content of the array

    }
}
