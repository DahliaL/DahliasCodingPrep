class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> mergedIntervals = new ArrayList<int[]>();

        Arrays.sort(intervals, (int1, int2) -> {
            if(int1[0] == int2[0])
                return Integer.compare(int1[1], int2[1]);
             else
                return Integer.compare(int1[0], int2[0]);
        });

        int start = intervals[0][0];
        int end = intervals[0][1];
        int tempStart = 0;
        int tempEnd = 0;
        for(int i = 1; i < intervals.length; i++) {
            tempStart = intervals[i][0];
            tempEnd = intervals[i][1];
             if (tempStart <= end) {
                // If they overlap, update the end to the maximum end value
                end = Math.max(end, tempEnd);
            } else {
                // If they don't overlap, add the current interval to the list
                mergedIntervals.add(new int[]{start, end});
                // Update the start and end to the new interval
                start = tempStart;
                end = tempEnd;
            }
        }

        // Add the last interval
        mergedIntervals.add(new int[]{start, end});

        // Convert the ArrayList to a 2D array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
