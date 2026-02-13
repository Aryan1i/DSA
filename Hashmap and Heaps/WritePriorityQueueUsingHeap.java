//Problem

    /*1. You are required to complete the code of our Priority Queue class using the heap data structure. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
    2. Here is the list of functions that you are supposed to complete:
        2.1. add -> Should accept new data.
        2.2. remove -> Should remove and return smallest value, if available or print 
         "Underflow" otherwise and return -1.
         2.3. peek -> Should return smallest value, if available or print "Underflow" 
         otherwise and return -1.
         2.4. size -> Should return the number of elements available.
    3. Input and Output is managed for you.
    Input Format
    Input is managed for you
    Output Format
    Output is managed for you
    Constraints
    None

    Input
    add 10
    add 20
    add 30
    add 40
    peek
    add 50
    peek
    remove
    peek
    remove
    peek
    remove
    peek
    remove
    peek
    quit
    
    Output
    10
    10
    10
    20
    20
    30
    30
    40
    40
    50*/

//Solution

import java.io.*;
import java.util.*;

public class HeapPQ {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
        data = new ArrayList<>();
    }

    public PriorityQueue(int[] arr){
      data = new ArrayList<>();
      for(int val: arr){
        data.add(val);
      }

      for(int i = data.size() / 2 - 1;i>=0;i--){
        downHeapify(i);
      }
    }

    public void add(int val) {
        data.add(val);
        int idx = data.size()-1;
        upHeapify(idx);
    }

    public void upHeapify(int idx){
      if(idx == 0) return;
      int parent = (idx -1) / 2;
      if(data.get(idx) < data.get(parent)){
        swap(idx,parent);
        upHeapify(parent);
      }
    }

    public int remove() {
        if(data.size()==0){
            System.out.println("ZeroElements");
            return -1;
        }
        swap(0,data.size()-1);
        int removedValue = data.remove(data.size() - 1);
        if(data.size() > 0){
          downHeapify(0);
        }
        return removedValue;
    }

    public void downHeapify(int pi){
        int mini = pi;

        int li = pi * 2 + 1;
        if(li<data.size() && data.get(li)<data.get(mini)){
            mini = li;
        }

        int ri = pi * 2 + 2;
        if(ri<data.size() && data.get(ri)<data.get(mini)){
            mini = ri;
        }

        if(mini != pi){
            swap(mini,pi);
            downHeapify(mini);
        }
    }

    private void swap(int i, int j){
        int ith = data.get(i);
        int jth = data.get(j);

        data.set(i,jth);
        data.set(j,ith);
    }

    public int peek() {
      if(data.size() == 0){
        System.out.println("Underflow");
        return -1;
      }

      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}

//Solution

