//Problem

//Size Of Generic Tree

//Solution

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class GenericTreeConstrctor {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int count=1;
        for(Node child:node.children){
            count=count+size(child);
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

        Node root=null;
        Stack<Node> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node  t = new Node();
                t.data=arr[i];

                if(st.size()>0){
                    st.peek().children.add(t);
                }else{
                    root=t;
                }
                st.push(t);
            }
        }

        System.out.println(size(root));
    }
}
