import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;



    public WordChecker(ArrayList<String> list) {
        wordList = list;
    }

    public WordChecker() {
        wordList = new ArrayList<String>();
    }

    public boolean isWordChain() {
        boolean wordChain = true;
        for(int i = 1; i < wordList.size(); i++) {
            String after = wordList.get(i);
            String before = wordList.get(i-1);
            if(after.indexOf(before) < 0) {
                wordChain = false;
            }
        }
        return wordChain;
    }


    /*public ArrayList<String> createList(String target) {
         }

     */
}