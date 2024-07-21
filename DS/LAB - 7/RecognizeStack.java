import java.util.Stack;

public class RecognizeStack {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int length = str.length();

        // Push the first half of the string onto the stack
        for (int i = 0; i < length / 2; i++) {
            stack.push(str.charAt(i));
        }

        // Start comparing from the middle of the string
        int startIndex = (length % 2 == 0) ? length / 2 : length / 2 + 1;

        for (int i = startIndex; i < length; i++) {
            if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"aca", "bcb", "abcba", "abbcbba"};

        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
}
