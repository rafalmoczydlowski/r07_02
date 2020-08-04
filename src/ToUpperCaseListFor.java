import java.util.ArrayList;
import java.util.List;

public class ToUpperCaseListFor {
    public static void main (String [] args) {
        List<String> words = new ArrayList<>();
        words.add("Wszystkie");
        words.add("słowa");
        words.add("mają");
        words.add("być");
        words.add("napisane");
        words.add("wielkimi");
        words.add("literami");
        System.out.println(words);
        System.out.println("___________________________________________________________");
        for (int i = 0; i < words.toArray().length; i++) {
            String element = words.get(i).toUpperCase();
            words.remove(i);
            words.add(i, element);
        }
        System.out.println(words);
    }
}
