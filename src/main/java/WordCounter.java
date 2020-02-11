import java.util.ArrayList;
import java.util.HashMap;

public class WordCounter {

    private String text;
    private HashMap<String, Integer> wordTally;

    public WordCounter(String text) {
        this.text = text;
        this.wordTally = new HashMap<String, Integer>();
    }

    private String[] getWordsFromText() {
        return this.text.split(" ");
    }

    public int getCountForWord(String wordToSearch) {
        return wordTally.get(wordToSearch);
    }

    public void makeWordTallyFromText() {
        String[] words = getWordsFromText();
        for (String word : words) {
            Integer currentCount = wordTally.getOrDefault(word, 0);
            Integer newCount = currentCount + 1;
            wordTally.put(word, newCount);
        }
    }

    public ArrayList<String> getUniqueWords() {
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for (String key : this.wordTally.keySet()){
            uniqueWords.add(key);
        }
        return uniqueWords;
    }
}
