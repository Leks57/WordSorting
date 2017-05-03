import java.io.IOException;
import java.util.*;

public class Model {
    private static Model instance = new Model();
    private int wordCount = 0;
    List<String> mList = new LinkedList<String>();

    private Model() {
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public List<String> getmList() {
        return mList;
    }

    public static Model getInstance() {
        return instance;
    }

    public void getNumberOfWords() {
        wordCount = View.getNumberOfWords();
    }

    public List<String> getWords() throws IOException {
        try {
            mList = Arrays.asList(View.getWordsString(wordCount).trim().split("[\\s]+")); //Используем регулярное выражение: \s - знак пробела, "+" - несколько повторений предыдущих пробелов, дополнительный \ - экранирование мета-символа
            if (mList.size() != wordCount) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неправильное количество слов! Повторите ввод!");
            mList = getWords();
        }

        return mList;
    }



}