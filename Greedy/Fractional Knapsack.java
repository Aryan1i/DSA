//Problem
    
    /*Given two arrays, val[] and wt[] , representing the values and weights of items, and an integer capacity representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack. You are allowed to break items into fractions if necessary.
    Return the maximum value as a double, rounded to 6 decimal places.
    
    Examples :
    
    Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
    Output: 240.000000
    Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240
    Input: val[] = [500], wt[] = [30], capacity = 10
    Output: 166.670000
    Explanation: Since the item’s weight exceeds capacity, we take a fraction 10/30 of it, yielding value 166.670000.
    Constraints:
    
    val.size() ≤ 105
    1 ≤ val[i], wt[i] ≤ 104
    1 ≤ capacity ≤ 109
    wt.size() = val.size()
    */

//Solution

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> {
                return Double.compare(b[1], a[1]);
            }
            );
        
        for(int i = 0; i < val.length; i++){
            pq.offer(new double[]{i,(double)val[i]/wt[i] * 1.0});
        }
        
        double ans = 0;
        
        while(pq.size() > 0 && capacity > 0){
            double[] temp = pq.remove();
            if(capacity >= wt[(int)temp[0]]){
                ans += (double)val[(int)temp[0]];
                capacity -= wt[(int)temp[0]];
            } else {
                ans += (temp[1] * capacity);
                break;
            }
        }
        
        return ans;
    }
}
