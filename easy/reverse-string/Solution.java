class Solution {
    public void reverseString(char[] s) {

        char tmp;
        int lengthOfChar = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[lengthOfChar];
            s[lengthOfChar--] = tmp;

        }

    }
}
