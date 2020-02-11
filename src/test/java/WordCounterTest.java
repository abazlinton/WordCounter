import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordCounterTest {

    private WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter("one two two three three three");
        wordCounter.makeTallyFromText();
    }

    @Test
    public void can_get_occurrences_count_for_a_word(){
        assertEquals(2, wordCounter.getCountForWord("two"));
    }

    @Test
    public void can_get_unique_words(){
        List<String> expected = Arrays.asList("one", "two", "three");
        assertTrue(wordCounter.getUniqueWords().equals(expected));
    }


}
