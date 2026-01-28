//Problem

/*Node To Root Path*/

//Solution

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import org.w3c.dom.Node;
import java.util.Queue;

public class GenericTreeConstrctor {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static ArrayList<Integer> cheakElementList(Node node, int data){
        if(node.data==data){
            ArrayList<Integer> list =new ArrayList<>();
            list.add(node.data);
            return list;
        }

        for(Node child:node.children){
            ArrayList<Integer> list = cheakElementList(child, data);
            if(list.size()>0){
                list.add(node.data);
                return list;
            }
        }
        return new ArrayList<>();
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

        ArrayList<Integer> list = cheakElementList(root,50);
    }
}
