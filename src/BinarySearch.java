public class BinarySearch {
    public static boolean searchRecurse(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right - left) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return searchRecurse(array, x, left, mid-1);
        } else {
            return searchRecurse(array, x, mid+1, right);
        }
    }

    public static boolean searchIterate(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
