import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ToUpperCaseListIterator {
    public static void main (String [] args) {
        List<String> words = new ArrayList<>();
        List<String> wordsUpperCase = new ArrayList<>();
        words.add("Wszystkie");
        words.add("słowa");
        words.add("mają");
        words.add("być");
        words.add("napisane");
        words.add("wielkimi");
        words.add("literami");
        System.out.println(words);
        System.out.println("___________________________________________________________");
        ListIterator<String> iter = words.listIterator();
        while (iter.hasNext()) {
            String element = iter.next().toUpperCase();
            wordsUpperCase.add(element);
        }
        System.out.println(wordsUpperCase);
    }
}
