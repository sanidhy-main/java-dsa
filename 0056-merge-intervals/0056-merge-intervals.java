class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] currentInterval = new int[1][2];
        int[][] mergedIntervals = new int[intervals.length][2];
        int counter = 0;

        currentInterval[0] = intervals[0];
        
        for (int i = 0; i < intervals.length - 1; i++) {
        if (currentInterval[0][1] >= intervals[i + 1][0]) {
            currentInterval[0][1] = Math.max(currentInterval[0][1], intervals[i+1][1]);
        } else {
            mergedIntervals[counter] = currentInterval[0];
            currentInterval[0] = intervals[i + 1];
            counter += 1;
        }
        }

        mergedIntervals[counter] = currentInterval[0];

        return Arrays.copyOfRange(mergedIntervals, 0, counter + 1);
    }
}