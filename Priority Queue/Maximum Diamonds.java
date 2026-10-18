//Problem
    
    /*There are  bags with diamonds in them. The i'th of these bags contains arr[i] diamonds.
    
    If you drop a bag with arr[i] diamonds, it changes to floor of arr[i]/2 diamonds and you gain arr[i] diamonds.
    Dropping a bag takes 1 minute. 
    Find the maximum number of diamonds that you can take if you are given k minutes.
    
    Examples:
    
    Input: arr[] =  [2, 1, 7, 4, 2],  k = 3
    Output: 14
    Explanation:
    The state of bags is:2 1 7 4 2
    Take all diamonds from Third bag (7).
    State of bags becomes: 2 1 3 4 2 
    Take all diamonds from Fourth bag (4).
    State of bags becomes: 2 1 3 2 2
    Take all diamonds from Third bag (3).
    State of bags becomes: 2 1 1 2 2 
    Hence,number of Diamonds = 7+4+3 = 14.
    Input: arr[] =[ 7, 1, 2],  k = 2
    Output: 10
    Explanation:
    Take all diamonds from First bag (7).
    State of bags becomes: 3 1 2 
    Take all diamonds from again First bag (3).
    State of bags becomes: 1 1 2
    You can take a maximum of 10 diamonds.
    Constraints:
    
    1 ≤ arr.size() ≤ 105
    0 ≤ arr[i], k ≤ 105
    */

//Solution

class Solution {
    public long maxDiamonds(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.offer(ele);
        }
        
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans += pq.peek();
            int x = pq.poll();
            pq.offer(x / 2);
        }
        
        return ans;
    }
}
