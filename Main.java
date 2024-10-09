import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");

        WordChecker x = new WordChecker(words);
        System.out.println(x.createList("band"));
    }
}
