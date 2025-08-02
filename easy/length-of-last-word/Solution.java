class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        int lengthOfString = s.length() - 1;

        if (lengthOfString == 1 && s.charAt(0) != ' ')
            return 1;

        for (int i = lengthOfString; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                count++;
                if (i > 1) {
                    if (s.charAt(i - 1) == ' ')
                        break;
                }
            }

        }
        return count;
    }
}
