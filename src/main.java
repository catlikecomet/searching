import java.io.IOException;
import java.util.List;

public class main {

    public static void main (String[] args) throws IOException {
        List list =ReadFile.readFile("/Users/cmummery/Training/words.txt");
        System.out.println(list);
        LinearSearch search = new LinearSearch();
        System.out.println(search.linearSearch(list, "spurter"));
    }
}
