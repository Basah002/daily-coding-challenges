class Solution {
    public int[] sumZero(int n) {
        if (n == 1)
            return new int[] { 0 };

        int[] array = new int[n];
        int r = 1;
        if (n % 2 == 0) {
            int index = 0;
            for (int i = 0; i < n / 2; i++) {
                array[index++] = r;
                array[index++] = -r;

                r++;
            }

        } else {
            array[n / 2] = 0;
            int lengthOfarray = array.length - 1;
            for (int i = 0; i < n / 2; i++) {
                array[i] = r;
                array[lengthOfarray--] = r * -1;
                r++;
            }

        }

        return array;
    }
}
