import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr)
            set.add(num);
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set)
            result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 5};
        System.out.println("Array with duplicates removed: " + Arrays.toString(removeDuplicates(array)));
    }
}
