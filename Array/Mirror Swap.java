    //Problem
    
    
    /*You have an array 
    A
    A of size 
    2
    ⋅
    N
    2⋅N.
    
    You can perform the following operation as many times as you want:
    
    Swap 
    A
    i
    A 
    i
    ​
      with 
    A
    2
    N
    +
    1
    −
    i
    A 
    2N+1−i
    ​
      (i.e. it's mirror element).
    For example, we can swap 
    A
    1
    A 
    1
    ​
      with 
    A
    2
    N
    A 
    2N
    ​
     , 
    A
    2
    A 
    2
    ​
      with 
    A
    2
    N
    −
    1
    A 
    2N−1
    ​
      and so on.
    
    You want to maximize the value 
    A
    1
    +
    A
    2
    +
    …
    +
    A
    N
    A 
    1
    ​
     +A 
    2
    ​
     +…+A 
    N
    ​
     , i.e. the sum of the first half of the array. Find this maximum value.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains a single integer 
    N
    N.
    The second line contains 
    N
    N integers - 
    A
    1
    ,
    A
    2
    ,
    …
    ,
    A
    2
    N
    A 
    1
    ​
     ,A 
    2
    ​
     ,…,A 
    2N
    ​
     .
    Output Format
    For each test case, output the maximum sum of the first half.
    
    Constraints
    1
    ≤
    T
    ≤
    100
    1≤T≤100
    1
    ≤
    N
    ≤
    100
    1≤N≤100
    1
    ≤
    A
    i
    ≤
    100
    1≤A 
    i
    ​
     ≤100
    Sample 1:
    Input
    Output
    2
    3
    1 4 3 4 2 1
    1
    100 99
    9
    100
    Explanation:
    Test Case 1: You can swap 
    A
    3
    A 
    3
    ​
      and 
    A
    4
    A 
    4
    ​
      to get 
    [
    1
    ,
    4
    ,
    4
    ,
    3
    ,
    2
    ,
    1
    ]
    [1,4,4,3,2,1] which has a first-half sum of 
    9
    9, which is optimal.
    
    Test Case 2: No swaps need to be made.*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		while(t-- > 0){
		    int n = scn.nextInt();
		    int[] arr = new int[2 * n];
		    
		    for(int i = 0; i < 2 * n; i++){
		        arr[i] = scn.nextInt();
		    }
		    
		    int i = 0;
		    int j = 2 * n - 1;
		    
		    int ans = 0;
		    
		    while(i < j){
		      ans += Math.max(arr[i], arr[j]);
		      i++;
		      j--;
		    }
		    
		    System.out.println(ans);
		}

	}
}
