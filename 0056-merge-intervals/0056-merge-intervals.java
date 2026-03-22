class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] currentInterval = intervals[0];
        int[][] result  = new int[intervals.length][2];
        int counter = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(intervals[i][1], currentInterval[1]);
            } else {
                result[counter] = Arrays.copyOf(currentInterval, 2);
                counter++;
                currentInterval = intervals[i];
            }
        }

        result[counter] = Arrays.copyOf(currentInterval, 2);
        counter++;

        return Arrays.copyOf(result, counter);
    }
}