//Problem

/* Level Order Traversal in one line*/

//solution

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

    public static void levelTrav(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);

        while(que.size()>0){
            node =que.remove();
            System.out.print(node.data + " ");
            for(Node child: node.children){
                que.add(child);
            }
        }
        System.out.println(".");
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
        levelTrav(root);
    }
}
