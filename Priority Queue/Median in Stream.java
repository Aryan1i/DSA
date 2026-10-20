//Problem
    
    /*Given a data stream arr[] where integers are read sequentially, find the median of the elements encountered so far after each new integer is read.
    
    The median is defined as follows:
    
    Odd number of elements: The median is the middle element when the current set of numbers is sorted.
    Even number of elements: The median is the arithmetic mean (average) of the two middle elements when the current set of numbers is sorted.
    Examples:
    
    Input: arr[] = [5, 15, 1, 3, 2, 8]
    Output: [5.0, 10.0, 5.0, 4.0, 3.0, 4.0] 
    Explanation: 
    After reading 1st element of stream – 5 -> median = 5.0
    After reading 2nd element of stream – 5, 15 -> median = (5+15)/2 = 10.0 
    After reading 3rd element of stream – 5, 15, 1 -> median = 5.0
    After reading 4th element of stream – 5, 15, 1, 3 ->  median = (3+5)/2 = 4.0
    After reading 5th element of stream – 5, 15, 1, 3, 2 -> median = 3.0
    After reading 6th element of stream – 5, 15, 1, 3, 2, 8 ->  median = (3+5)/2 = 4.0
    Input: arr[] = [2, 2, 2, 2]
    Output: [2.0, 2.0, 2.0, 2.0]
    Explanation: 
    After reading 1st element of stream – 2 -> median = 2.0
    After reading 2nd element of stream – 2, 2 -> median = (2+2)/2 = 2.0
    After reading 3rd element of stream – 2, 2, 2 -> median = 2.0
    After reading 4th element of stream – 2, 2, 2, 2 ->  median = (2+2)/2 = 2.0
    Constraints:
    
    1 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 106
    */

//Solution

class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        ArrayList<Double> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(max.isEmpty() || arr[i] > max.peek()){
                min.offer(arr[i]);
            } else {
                max.offer(arr[i]);
            }
            
            int diff = max.size() - min.size();
            
            if(diff == 2){
                min.offer(max.poll());
            } else if(diff == -1){
                max.offer(min.poll());
            }
            
            int x = min.size() + max.size();
            
            if(x % 2 == 0){
                ans.add((min.peek() + max.peek()) / 2.0);
            } else{
                ans.add(max.peek()*1.0);
            }
        }
        return ans;
    }
}
