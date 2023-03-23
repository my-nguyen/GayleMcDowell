public class BubbleSort {
    public static void sort(int[] array) {
        GayleMcDowell(array);
    }

    private static void GayleMcDowell(int[] array) {
        boolean sorted = false;
        int lastUnsorted = array.length - 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i+1]) {
                    // swap(array, i, i+1);
                    sorted = false;
                }
            }
            lastUnsorted--;
        }
    }
}
