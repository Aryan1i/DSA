//Problem

/*Transform to Left Cloned Tree*/

//Soliton

public static Node createLeftCloneTree(Node node) {
        if(node==null)return node;

        Node leftC = createLeftCloneTree(node.left);
        Node rightC = createLeftCloneTree(node.right);

        
            Node temp = new Node(node.data);
            temp.left=leftC;
            node.left=temp;
            node.right=rightC;
        
        return node;
    }
