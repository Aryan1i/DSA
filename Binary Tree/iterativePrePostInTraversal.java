//Problem

/*iterative Pre Post and In Traversal in binary tree*/

//Solution

public static void iterativePrePostInTraversal(Node node){
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node, 1));

        String pre = "";
        String in = "";
        String post = "";

        while(st.size()>0){
            Pair top = st.peek();
            if(top.state == 1){
                pre += top.node.data + " ";
                if(top.node.left!=null)st.push(new Pair(top.node.left, 1));
                top.state++;
            }else if(top.state == 2){
                in += top.node.data + " ";
                if(top.node.right!=null)st.push(new Pair(top.node.right, 1));
                top.state++;
            }else{
                post += top.node.data + " ";
                st.pop();
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
