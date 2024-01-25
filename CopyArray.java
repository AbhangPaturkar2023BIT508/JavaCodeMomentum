public class CopyArray {
    public static void main(String[] args) {
        char[] array = { 'A', 'E', 'I', 'O', 'U' };
        char arrayCopy[] = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println(array);
        System.out.println(arrayCopy);

    }
}
