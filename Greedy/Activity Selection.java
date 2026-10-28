//Problem
    
    /*Given two arrays start[] and finish[], where start[i] and finish[i] represent the start time and finish time of the i-th activity, find the maximum number of activities that a single person can perform.
    
    A person can perform only one activity at a time, and no two selected activities can overlap. If an activity finishes at time x, the next selected activity must start at a time greater than x.
    
    Examples:
    
    Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
    Output: 4
    Explanation: One possible selection is activities {0, 1, 3, 4} with time intervals (1, 2), (3, 4), (5, 7), and (8, 9). Each activity starts after the previous one finishes, so a total of 4 activities can be performed.
    Input: start[] = [10, 12, 20], finish[] = [20, 25, 30]
    Output: 1
    Explanation: Activity 0 finishes at time 20, and activity 2 also starts at time 20. Since the next activity must start after the previous one finishes, they cannot both be selected. Hence, only one activity can be performed.
    Constraints:
    
    1 ≤ start.size(), finish.size() ≤ 2*105
    0 ≤ start[i], finish[i] ≤ 109
    finish.size() = start.size()*/

//Solution

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                return Integer.compare(a[1], b[1]);
            }
            );
        
        for(int i = 0; i < start.length; i++){
            pq.offer(new int[]{start[i], finish[i]});
        }
        
        int ans = 0;
        int pre = -1;
        
        while(pq.size() > 0){
            int[] temp = pq.remove();
            if(temp[0] > pre){
                ans++;
                pre = temp[1];
            }
        }
        
        return ans;
    }
}
