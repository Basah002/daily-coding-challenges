class Solution {
    public int hammingWeight(int n) {

        if (n == 0)
            return 0;
        int tmp = 0;

        while (n > 0) {

            if (n % 2 != 0) {
                tmp++;
            }
            n = n / 2;

        }

        return tmp;
    }
}
