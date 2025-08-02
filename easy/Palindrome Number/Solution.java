class Solution {
    public boolean isPalindrome(int x) {

        String palindrom = String.valueOf(x);

        int lengthOfPalindrom = palindrom.length();

        for (int i = 0; i < lengthOfPalindrom / 2; i++) {
            if (!(palindrom.charAt(i) == palindrom.charAt(lengthOfPalindrom - i - 1))) {
                return false;
            }

        }

        return true;
    }
}
