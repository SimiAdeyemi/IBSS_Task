package words;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Words {
    public static List<String> getUniqueWordsFromSentence(String sentence) {
        // Uses a LinkedHashSet to keep the insertion order and ensure uniqueness
        Set<String> uniqueWords = new LinkedHashSet<>();

        // Regex pattern to match the words
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sentence.toLowerCase());

        // Add matched words to the LinkedHashSet
        while (matcher.find()) {
            String word = matcher.group();
            uniqueWords.add(word);
        }

        // Convert the LinkedHashSet to a List and return
        return new ArrayList<>(uniqueWords);
    }
}