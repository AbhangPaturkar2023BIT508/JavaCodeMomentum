public class Main {
    static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "hello world";
        char character = 'l';
        System.out.println("Occurrences of '" + character + "': " + countOccurrences(text, character));
    }
}
