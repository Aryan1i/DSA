//Problem

/*TransBack From Left Cloned Tree*/

//Solution

public static Node transBackFromLeftClonedTree(Node node) {
        if(node==null)return  null;
        
        Node leftOriginal=null;
        if (node.left != null) {
            leftOriginal = node.left.left;
        }


        node.left=transBackFromLeftClonedTree(leftOriginal);
        node.right=transBackFromLeftClonedTree(node.right);

        return node;
    }
