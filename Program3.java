public class Main {

    public static void main(String[] args) {
        String string = "Hello world, Java Strings!";
        char[] charArray = "Hello world, Java Chars!".toCharArray();

        System.out.println("Using Java String type:");
        System.out.println("Length of string: " + string.length());

        String string2 = " Welcome!";
        System.out.println("Concatenation: " + string2 + string);

        String subString = string.substring(0, 5);
        System.out.println("Substring: " + subString);

        int found = string.indexOf("Java");
        if (found != -1) {
            System.out.println("Found 'Java' at position " + found);
        } else {
            System.out.println("'Java' not found");
        }

        System.out.println();

        System.out.println("Using Java char array (char[]):");
        System.out.println("Length of charArray: " + charArray.length);

        char[] charArray2 = " Welcome!".toCharArray();
        StringBuilder concatenated = new StringBuilder();
        concatenated.append(charArray2);
        concatenated.append(charArray);
        System.out.println("Concatenation: " + concatenated);

        char[] subCharArray = new char[5];
        System.arraycopy(charArray, 0, subCharArray, 0, 5);
        System.out.println("Substring: " + new String(subCharArray));

        int foundIndex = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'J') {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found 'J' at position " + foundIndex);
        } else {
            System.out.println("'J' not found");
        }
    }
}
