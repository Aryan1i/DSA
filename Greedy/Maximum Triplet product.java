//Problem
    
    /*Given an array arr, find the maximum product that can be obtained by multiplying any three elements of the array. Return the maximum triplet product.
    
    Examples:
    
    Input: arr[] = [1, 2, 3, 5]
    Output: 30
    Explanation: (5)*(3)*(2) gives 30. This is the maximum possible triplet product in the array.
    Input: arr[] = [-3, -5, 1, 0, 8, 3, -2]
    Output: 120
    Explanation: (-3)*(-5)*(8) gives 120. This is the maximum possible triplet product in the array.
    Constraints:
    3 ≤ n ≤ 5*106
    -10-3 ≤ arr[i] ≤ 103*/

//Solution

class Solution {
    public int maxTripletProduct(int[] arr) {
        if(arr.length == 3) return arr[0] * arr[1] * arr[2];
        PriorityQueue<Integer> neg = new PriorityQueue<>();
        PriorityQueue<Integer> pos = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                neg.offer(arr[i]);
            } else {
                pos.offer(arr[i]);
            }
        }
        
        int ans = 0;
        if(neg.size() >= 2){
            ans = neg.remove();
            ans *= neg.remove();
        }
        
        int i = 1;
        int temp = 1;
        while(pos.size() > 0 && i <= 3){
            if(i == 1) ans *= pos.peek();
            temp *= pos.remove();
            i++;
        }
        return Math.max(ans, temp);
    }
};
