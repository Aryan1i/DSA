//Problem

/*Size Sum Max and Height of binary tree*/

//Solution

import java.util.Scanner;
import java.util.Stack;
public class BinaryTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left ,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){
        if(node == null) return;

        String str = "";
        str += node.left==null? "." : node.left.data + " ";
        str += " <- " + node.data + " -> ";
        str += node.right== null? "." : node.right.data + " ";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size (Node node){
        if(node == null) return 0;

        int ls = size(node.left);
        int rs = size(node.right);

        return ls + rs + 1;
    }

    public static int sum(Node node){
        if(node == null) return 0;

        int ls = sum(node.left);
        int rs = sum(node.right);

        return ls + rs + node.data;
    }

    public static int max(Node node){
        if(node == null) return Integer.MIN_VALUE;

        int lmax = max(node.left);
        int rmax = max(node.right);

        return Math.max(lmax, Math.max(rmax, node.data));
    }

    public static int height(Node node){

        if(node == null) return 0;

        int lheight = height(node.left);
        int rheight = height(node.right);

        if(lheight > rheight){
            return lheight+1;
        }else {
            return rheight+1;
        }
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        Integer[] arr = {50 ,25, 12, null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root,1);
        
        Stack<Pair> st = new Stack<>();
        st.push(rtp);
        int i=0;
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==1){
                i++;
                if(i < arr.length && arr[i] != null){
                    top.node.left = new Node(arr[i], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;
            } else if (top.state == 2){
                i++;
                if(i < arr.length && arr[i] != null){
                    top.node.right = new Node(arr[i], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }else{
                    top.node.right=null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }

        display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
