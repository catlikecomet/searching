import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    //Keep splitting in half until said word is found
    public String binarySearch(List<String> list, String word) {
        int firstIndex = 0;
        int lastIndex = list.size() - 1;

        while (firstIndex <= lastIndex) {
            int middleOfList = (lastIndex + firstIndex) / 2;

            if (list.get(middleOfList).equals(word)) {
                return word;
            } else if (list.get(middleOfList).compareTo(word) < 0) {
                firstIndex = middleOfList + 1;
            } else if (list.get(middleOfList).compareTo(word) > 0){
                lastIndex = middleOfList - 1;
            } else {
                return word;
            }
        }
            return word + " is not in the list";
    }
}
