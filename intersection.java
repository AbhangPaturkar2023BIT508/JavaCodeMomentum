import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr1)
            set1.add(num);
        for (int num : arr2) {
            if (set1.contains(num))
                intersection.add(num);
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int
