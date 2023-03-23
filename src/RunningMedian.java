public class Solution {
    public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> bigger = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smaller = lowers.size() > highers.size() ? highers : lowers;
        if (bigger.size() - smaller.size() >= 2) {
            smaller.add(bigger.poll());
        }
    }

    public static void getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> bigger = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smaller = lowers.size() > highers.size() ? highers : lowers;
        if (bigger.size() == smaller.size()) {
            return ((double)bigger.peek() + smaller.peek()) / 2;
        } else {
            return bigger.peek();
        }
    }

    public static double[] getMedians(int[] array) {
        PriorityQueue<Integer> lowers = new PriorityQueue<>( new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return -1 * a.compareTo(b);
            }
        });
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }
        return medians;
    }
}
