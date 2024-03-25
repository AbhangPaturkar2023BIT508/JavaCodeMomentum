import java.util.Arrays;

public class Main {
    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        System.out.println(word1 + " and " + word2 + " are anagrams: " + areAnagrams(word1, word2));
    }
}
