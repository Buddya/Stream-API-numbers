import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    //Класс демонстрирует те же операции поиска и сортировки с использованием StreamAPI
    //разница коллосальна...
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
