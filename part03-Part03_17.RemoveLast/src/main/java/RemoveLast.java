
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        String[] strings = {"Gueto", "Guetomaster", "Fraldão", "Jaburu" };
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : strings) {
            list.add(s);
        }
        
        removeLast(list);
        System.out.println(list);
        
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        
        strings.remove(strings.size() - 1);
    }
}
