class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;

        long tmp = 1;
        
        while (true) {

            tmp *= 2;

            if (tmp == n)
                return true;

            if (tmp > n)
                return false;

        }
    }
}
