import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filename = "input.txt";

        WordCounter wordCounter = new WordCounter(filename);
        int wordCount = wordCounter.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        FindLongestWord longestWordFinder = new FindLongestWord(filename);
        String longestWord = longestWordFinder.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        WordValue frequencyCounter = new WordValue(filename);
        Map<String, Integer> wordFrequency = frequencyCounter.countWordFrequency();
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
