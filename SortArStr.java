import java.util.Arrays;

public class Main {
    static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "orange", "grape"};
        System.out.println("Sorted array of strings: " + Arrays.toString(sortStrings(strings)));
    }
}
