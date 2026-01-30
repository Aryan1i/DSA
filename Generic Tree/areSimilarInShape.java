//Problem

/*Are trees similar in Shape*/

//Soluition

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

    public static boolean areSimilar(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size()){
            return false;
        }

        for(int i=0;i<n1.children.size();i++){
            if(areSimilar(n1.children.get(i), n2.children.get(i))==false){
                return false;
            }
        }

        return true;
    }

}
