//Problem

/*Distance between nodes*/

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

    public static int disBetweenNodes(Node node ,int data1,int data2){
        ArrayList<Integer> list1 = cheakElementList(node,data1);
        ArrayList<Integer> list2 = cheakElementList(node,data2);

        int i=list1.size()-1;
        int j=list2.size()-1;
        while(i>=0 && j>=0 &&list1.get(i)==list2.get(j)){
            i--;
            j--;
        }
        i++;
        j++;
        return i+j;
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

        System.out.println(disBetweenNodes(root, 70, 110));
    }
}
