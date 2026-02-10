//Problem

/*Remove all the leaves from the binary tree*/

//Solution


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

  public static void removeLeaves(Node node){
        if(node == null) return ;

        if(node.left == null && node.right == null){
            return null;
        }

        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);
  }
