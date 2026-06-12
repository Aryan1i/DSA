//Problem

    /*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.
    
    Examples:
    
    Input: arr[] = [111, 222, 333, 444, 555]
    Output: true
    Explanation:
    arr[0] = 111, which is a palindrome number.
    arr[1] = 222, which is a palindrome number.
    arr[2] = 333, which is a palindrome number.
    arr[3] = 444, which is a palindrome number.
    arr[4] = 555, which is a palindrome number.
    As all numbers are palindrome so This will return true.
    Input: arr[] = [121, 131, 20]
    Output: false
    Explanation: 20 is not a palindrome hence the output is false.
    Constraints:
    1 <=arr.size<= 20
    1 <=arr[i]<= 105*/

//Solution

class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int ori = arr[i];
            int rev = 0;
            while(arr[i] > 0){
                rev = rev*10 + (arr[i]%10);
                arr[i]/=10;
            }
            if(ori != rev) return false;
        }
        return true;
    }
}

