import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLongestWord {
    private final String filename;

    public FindLongestWord(String filename) {
        this.filename = filename;
    }

    public String findLongestWord() {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
            return longestWord;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
            return null;
        }
    }
}
