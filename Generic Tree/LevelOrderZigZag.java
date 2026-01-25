//Problem

/*Level Order Traversal Zig Zag*/

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

    public static void levelTravZigZag(Node node){
        Stack<Node> main = new Stack<>();
        Stack<Node> temp = new Stack<>();
        main.push(node);
        while(temp.size()>0 || main.size()>0){
            while(main.size()>0){
                node=main.pop();
                System.out.print(node.data+" ");

                for(Node child:node.children){
                    temp.push(child);
                }
            }
            System.out.println();
            
            while(temp.size()>0){
                node=temp.pop();
                System.out.print(node.data+" ");

                for(int i=node.children.size()-1;i>=0;i--){
                    Node child=node.children.get(i);
                    main.push(child);
                }
            }
            System.out.println();
        }
        
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

        levelTravZigZag(root);
    }
}
