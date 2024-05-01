import java.util.Stack;

public class Main {
    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "(a+b)*(c-d)";
        System.out.println("Balanced: " + isBalanced(expression));
    }
}
