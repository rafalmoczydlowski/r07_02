import java.util.ArrayList;
import java.util.List;

public class ToUpperCaseListReplaceAll {
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
        words.replaceAll((x) -> x.toUpperCase());
        System.out.println(words);
    }
}
