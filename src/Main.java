import java.util.Arrays;
import java.util.List;

public class Main {
    //Класс демонстрирует операции поиска, отбора и сортировки без использования StreamAPI
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int[] sortedEvenPositiveNumbers = getSortedEvenPositiveNumbers(intList);
        printArray(sortedEvenPositiveNumbers);
    }

    public static int[] getSortedEvenPositiveNumbers(List<Integer> intList) {
        Integer[] evenPositiveNumbersArray = new Integer[intList.size()];
        int counter = 0;

        for (Integer number : intList) {
            if (number > 0) {
                if (number % 2 == 0) {
                    evenPositiveNumbersArray[counter++] = number;
                }
            }
        }
        int[] sortedArray = new int[counter];
        for (int i = 0; i < counter; i++) {
            sortedArray[i] = evenPositiveNumbersArray[i];
        }
        sortArray(sortedArray);
        return sortedArray;
    }

    public static void sortArray(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[min]) {
                    min = i;
                }
                int tmp = array[left];
                array[left] = array[min];
                array[min] = tmp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (Integer number : array) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
}
