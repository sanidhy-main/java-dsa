class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int left = 0;
       int right = 0;
       int answer = 0;
       int currentLoad = 0;
       int daysNeeded = 1;

       for (int w : weights) {
        left = Math.max(w, left);
        right += w;
       }

       int mid = left + (right - left)/2;

       while (left <= right) {
        mid = left + (right - left)/2;

        currentLoad = 0;
        daysNeeded = 1;
        for (int weight : weights) {
            if (currentLoad + weight <= mid) {
                currentLoad += weight;
            } else {
                daysNeeded++;
                currentLoad = weight;
            }
        }

        if (daysNeeded <= days) {
            answer = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
       }

       return answer;
    }
}