import java.util.Stack;

public class BalancedParentheses {
    public static char[][] TOKENS = { { '{', '}' }, { '[', ']' }, { '(', ')' } };

    public static boolean isOpenTerm(char c) {
        for (char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char open, char close) {
        for (char[] array : TOKENS) {
            if (array[0] == open) {
                return array[1] == close;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
