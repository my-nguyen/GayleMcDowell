class Solution {
    public static int NUMBER_LETTERS = 26;

    pubblic static int getDelta(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return -1;
        }
        int delta = 0;
        for (int i = 0; i < array1.length; i++) {

            int difference = Math.abs(array1[i] - array2[i]);
            delta += difference;
        }
        return delta;
    }

    public static int[] getCharCounts(String s) {
        int[] charCounts = new int[NUMBER_LETTERS];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - (int)'a']++;
        }
        return charCounts;
    }

    public static int numberNeeded(String first, String second) {
        int[] charCount1 = getCharCounts(first);
        int[] charCount2 = getCharCounts(second);
        return getDelta(charCount1, charCount2);
    }

    public static void main(String[] args) throw Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
    }
}
