import java.io.IOException;
import java.util.List;

public class main {

    public static void main (String[] args) throws IOException {
        List list =ReadFile.readFile("/Users/cmummery/Training/words.txt");
        System.out.println(list);
        LinearSearch search = new LinearSearch();
        BinarySearch otherSearch = new BinarySearch();
        System.out.println("Linear Search: ");
        System.out.println(search.linearSearch(list, "spurter"));
        System.out.println(search.linearSearch(list, "qwhjfhb"));
        System.out.println("Binary Search: ");
        System.out.println(otherSearch.binarySearch(list, "spurter"));
        System.out.println(otherSearch.binarySearch(list, "sqdfqfw"));
    }
}
