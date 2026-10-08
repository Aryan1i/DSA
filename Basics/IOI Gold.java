//Problem
    
    /*Chef recently participated in the IOI competition, and scored 
    N
    N points out of 
    600
    600 on the 
    2
    2 days of competition.
    
    Just now, the gold cutoff was released, which was 
    G
    G points, meaning everyone with at least 
    G
    G points gets a gold medal. Chef wants to know if he will get gold or not. Print 
    Yes
    Yes or 
    No
    No accordingly.
    
    Both 
    N
    N and 
    G
    G are integers.
    
    Input Format
    The first and only line contains 
    2
    2 integers - 
    N
    N and 
    G
    G.
    Output Format
    Output 
    Yes
    Yes or 
    No
    No depending on whether Chef gets a gold medal or not.
    
    Constraints
    0
    ≤
    N
    ,
    G
    ≤
    600
    0≤N,G≤600
    Sample 1:
    Input
    Output
    498 361
    Yes
    Explanation:
    Chef scored 
    498
    498 points while the gold cutoff was 
    361
    361 points, so he easily clears the cutoff. One might even think he could win the IOI.
    
    Sample 2:
    Input
    Output
    300 361
    No
    Explanation:
    Chef scored 
    300
    300 points while the cutoff was 
    361
    361, hence he failed to get a gold.*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int g = scn.nextInt();
		
		if(n >= g){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}

	}
}
