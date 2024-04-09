import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    private String filename;

    public WordCounter(String filename) {
        this.filename = filename;
    }

    public int countWords() {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            scanner.close();
            return wordCount;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
            return -1;
        }
    }
}


