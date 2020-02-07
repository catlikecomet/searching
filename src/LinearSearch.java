import java.util.List;

public class LinearSearch {

    public String linearSearch(List<String> list, String word) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                return word;
            }
        }
        return "word not in list";
    }
}
