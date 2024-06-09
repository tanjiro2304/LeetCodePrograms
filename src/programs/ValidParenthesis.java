package programs;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (c == '{') {
                count = count + 1;
            }
            if (c == '(') {
                count=count+2;
            }
            if (c == '[') {
                count=count+3;
            }
            if (c == '}') {
                count = count - 1;
            }
            if (c == ')') {
                count=count-2;
            }
            if (c == ']') {
                count=count+3;
            }

        }
        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
