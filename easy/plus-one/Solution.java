class Solution {
    public int[] plusOne(int[] digits) {

        int lastIndexOfArray = digits.length - 1;

        if (digits[lastIndexOfArray] != 9) {
            digits[lastIndexOfArray] = digits[lastIndexOfArray] + 1;
            return digits;
        }

        boolean alleNeunen = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                alleNeunen = false;
                break;
            }
        }

        if (alleNeunen) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            return array;
        } else {

            for (int i = lastIndexOfArray; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {

                    digits[i] += 1;
                    break;
                }

            }

        }

        return digits;
    }
}
