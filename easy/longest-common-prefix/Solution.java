class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = "";
        Arrays.sort(strs);

        int length = strs.length - 1;

        int min = Math.min(strs[0].length(), strs[strs.length-1].length());

        for (int i = 0; i < min; i++) {

            if (strs[0].charAt(i) == strs[length].charAt(i)) {
                prefix += strs[0].charAt(i);

            } else {
                break;

            }

        }

        return prefix;
    }
}
