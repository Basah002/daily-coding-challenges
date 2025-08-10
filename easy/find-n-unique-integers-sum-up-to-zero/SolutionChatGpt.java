// Viel einfacher als meine Lösung mit den zwei For-Schleifen


class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Paare füllen
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // Falls ungerade, kommt 0 automatisch am Ende
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
