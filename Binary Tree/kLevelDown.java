//Problem

/*Print k level Down in Binary tree*/

//Solution

  public static void KlevelDown(Node root,int k){
        if(root==null || k<0) return;
        int count = 0;
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while(que.size()>0){
            int size = que.size();
            if(count == k){
                while(que.size()!=0){
                    Node top = que.remove();
                    System.out.print(top.data + " ");
                }
                break;
            }
            for(int i=0;i<size;i++){
                Node top = que.remove();
                if(top.left!=null) que.add(top.left);
                if(top.right != null) que.add(top.right);
            }
            count++;
        }
    }
