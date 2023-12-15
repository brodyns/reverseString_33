public class Main {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new Solution().reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
