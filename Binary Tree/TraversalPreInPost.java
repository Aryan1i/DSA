//Problem

/*Traversal Pre In and Post in binary tree*/

//Solution

    public static void traversalPre(Node node){
        if(node == null) return;
        System.out.println(node.data);
        traversalPre(node.left);
        traversalPre(node.right);
    }

    public static void traversalIn(Node node){
        if(node == null) return;
        traversalIn(node.left);
        System.out.println(node.data);
        traversalIn(node.right);
    }

    public static void traversalPost(Node node){
        if(node == null) return;
        traversalPost(node.left);
        traversalPost(node.right);
        System.out.println(node.data);
    }
