package programs;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int result = 0;
        int originalValue = x;
        while(x != 0){
            result = result + (x % 10);
            x = x /10;
            if(x != 0){
                result =result * 10;
            }
        }
        return result == originalValue;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}