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

    public static void display(Node node ){
        String str = node.data + "->";

        for(Node child : node.children){
            str+=child.data + ",";
        }

        System.out.println(str);

        for(Node child:node.children){
            display(child);
        }
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

    public static int max(Node node){
        if(node==null){
            return 0;
        }

        int max=node.data;

        for(Node child:node.children){
            int temp=max(child);
            if(temp>max){
                max=temp;
            }
        }
        return max;
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

    public static int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int count=1;
        for(Node child:root.children){
            int temp=1+maxDepth(child);
            count=Math.max(count,temp);
        }
        return count;
    }

    public static void removeleaves(Node node ){
        for (int i=node.children.size()-1;i>=0;i--){
            Node child = node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }
        }

        for(Node child:node.children){
            removeleaves(child);
        }
    }

    public static void linearize(Node node){
        for(Node child: node.children){
            linearize(node);
        }
        while(node.children.size()>1){
            Node lt =node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slt=getTail(sl);
            slt.children.add(lt);
        }
    }

    public static Node getTail(Node node){
        while(node.children.size()!=0){
            node=node.children.get(0);
        }
        return node;
    }

    public static boolean cheakElement(Node node, int data){
        if(node.data==data){
            return true;
        }

        for(Node child:node.children){
            Boolean found = cheakElement(child, data);
            if(found){
                return true;
            }
        }
        return false;
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

    public static int lowestCommonAncester(Node node,int data1,int data2){
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
       return list1.get(i);
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

        display(root);
        System.out.println(size(root));
        System.out.println(max(root));
        traversal(root);
        levelTrav(root);
        levelTravLineByLine(root);
        // levelTravZigZag(root);
        mirror(root);
        levelTravLineByLine(root);
        System.out.println(cheakElement(root,30));

        ArrayList<Integer> list = cheakElementList(root,50);
        System.out.println(list);
        System.out.println(lowestCommonAncester(root,50,100));
        System.out.println(disBetweenNodes(root, 70, 110));
    }
}
