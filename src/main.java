import java.io.IOException;
import java.util.List;

public class main {

    public static void main (String[] args) throws IOException {
        List<String> list = ReadFile.readFile("/Users/cmummery/Training/words.txt");
        for(String item: list){
            System.out.println(item);
        }
        LinearSearch search = new LinearSearch();
        BinarySearch otherSearch = new BinarySearch();
        System.out.println("Linear Search: ");
        System.out.println(search.linearSearch(list, "spurter"));
        System.out.println(search.linearSearch(list, "qwhjfhb"));
        System.out.println("Binary Search: ");
        System.out.println(otherSearch.binarySearch(list, "abaco"));
        System.out.println(otherSearch.binarySearch(list, "sqdfqfw"));
    }
}
