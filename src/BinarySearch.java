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
            } else if (list.indexOf(word) < list.indexOf(middleOfList)) {
                lastIndex = middleOfList - 1;
            } else {
                firstIndex = middleOfList + 1;
            }
        }
            return word + " is not in the list";
    }
}
