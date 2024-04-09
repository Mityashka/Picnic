import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordValue {
    private final String filename;

    public WordValue(String filename) {
        this.filename = filename;
    }

    public Map<String, Integer> countWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
