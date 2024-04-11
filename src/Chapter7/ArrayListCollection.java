package Chapter7;
import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        //Creating an arraylist of Strings
        ArrayList<String> items = new ArrayList<String>();
        items.add("red");
        items.add(0, "yellow");
        System.out.print("Display list contents with counter-controlled loop: ");

        for(int i = 0; i < items.size(); i++) {
            System.out.printf("%s ", items.get(i));
        }
    }
}
