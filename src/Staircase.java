public class Staircase {
    public static int countPathsRecurse(int steps) {
        if (steps < 0) {
            return  0;
        } else if (steps == 0) {
            return 1;
        } else {
            return countPathsRecurse(steps-1) + countPathsRecurse(steps-2) + countPathsRecurse(steps-3);
        }
    }

    public static int countPathsMemo(int steps) {
        return countPathsMemo(steps, new int[steps+1]);
    }

    public static int countPathsMemo(int steps, int[] memo) {
        if (steps < 0) {
            return  0;
        } else if (steps == 0) {
            return 1;
        }
        if (memo[steps] == 0) {
            memo[steps] = countPathsMemo(steps-1, memo) + countPathsMemo(steps-2, memo) + countPathsMemo(steps-3, memo);
        }
        return memo[steps];
    }

    public static int countPathsDynamic(int steps) {
        if (steps < 0) {
            return  0;
        } else if (steps <= 1) {
            return 1;
        }
        int[] paths = new int[steps + 1];
        paths[0] = 1;
        paths[1] = 1;
        paths[2] = 2;
        for (int i = 3; i <= steps; i++) {
            paths[i] = paths[i-1] + paths[i-2] + paths[i-3];
        }
        return paths[steps];
    }

    public static int countPathsIterate(int steps) {
        if (steps < 0) {
            return  0;
        } else if (steps <= 1) {
            return 1;
        }
        int[] paths = { 1, 1, 2 };
        for (int i = 3; i <= steps; i++) {
            int count = paths[2] + paths[1] + paths[0];
            paths[0] = paths[1];
            paths[1] = paths[2];
            paths[2] = count;
        }
        return paths[2];
    }
}
