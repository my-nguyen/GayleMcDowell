public class QuickSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length-1);
    }

    public static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        sort(array, left, index-1);
        sort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                // swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
