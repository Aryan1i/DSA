//Problem

/*MirrorOfGenericTree*/

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

    public static void levelTravLineByLine(Node node){
        Queue<Node> main = new ArrayDeque<>();
        Queue<Node> temp = new ArrayDeque<>();
        main.add(node);
        while(temp.size()>0 || main.size()>0){
            while(main.size()>0){
                node=main.remove();
                System.out.print(node.data+" ");

                for(Node child:node.children){
                    temp.add(child);
                }
            }
            System.out.println();
            
            while(temp.size()>0){
                node=temp.remove();
                System.out.print(node.data+" ");

                for(Node child:node.children){
                    main.add(child);
                }
            }
            System.out.println();
        }
    }
  
    public static void mirror(Node node){
        if(node==null){
            return ;
        }
        for(Node child:node.children){
            mirror(child);
        }

        int left=0;
        int right=node.children.size()-1;
        while(left<right){
            Node temp=node.children.get(left);
            node.children.set(left,node.children.get(right));
            node.children.set(right,temp);
            left++;
            right--;
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

        levelTravLineByLine(root);
        mirror(root);
        levelTravLineByLine(root);

    }
}
