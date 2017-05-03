import Comparators.LetterNumberComparator;
import Comparators.ReversedComparator;
import Comparators.VowelsComparator;

import java.lang.String;
import java.io.IOException;
import java.util.Collections;

public class WordSorting {

    public static void main(String[] args) throws IOException {
        do {
            Model.getInstance().setWordCount(View.getNumberOfWords());

            //Сортировка с помощью 3-х компараторов
            Collections.sort(Model.getInstance().getWords(), new VowelsComparator().thenComparing(new LetterNumberComparator()).thenComparing(new ReversedComparator()));

            View.printList(Model.getInstance().getmList());
        } while (!View.isExit());
    }
}

//Проверка работы программы
// Строка для ввода: "Кашалот Катафалк Шар Трактор Яблоко"