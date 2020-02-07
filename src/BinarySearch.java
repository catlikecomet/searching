import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    //Keep splitting in half until said word is found
    public String binarySearch(List<String> list, String word) {
        int firstIndex = 0;
        int lastIndex = list.size();
        int middleOfList = lastIndex - firstIndex / 2;

        if (list.get(middleOfList).equals(word)) {
            return word;
        }

        for (int i = 0; i < middleOfList; i++) {

        }

        return word + " is not in the list";
    }
}
