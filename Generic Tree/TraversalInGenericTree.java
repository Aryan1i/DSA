//Problem

//Traversal In Generic Tree

//Solution

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class GenericTreeConstrctor {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traversal(Node node){
        System.out.println("Node Pre"+ node.data);

        for(Node child:node.children){
            System.out.println("Edge pre" + node.data + "--" + child.data);
            traversal(child);
            System.out.println("Edge post" + node.data + "--" + child.data);
        }
        
        System.out.println("Node Post"+ node.data);
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int [] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};

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

        traversal(root);
    }
}
