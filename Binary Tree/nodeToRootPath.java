//Problem

/*Node To Root Path*/

//Solution

    public static ArrayList<Integer> NodetoRoot(Node root,int target){
        if(root == null ) return new ArrayList<>();
        if(root.data == target){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(root.data);
            return temp;
        }
        
        ArrayList<Integer> listLeft = NodetoRoot(root.left, target);

        if(listLeft.size()>0){
            listLeft.add(root.data);
            return listLeft;
        }
        ArrayList<Integer> listRight = NodetoRoot(root.right, target);
        if(listRight.size()>0){
            listRight.add(root.data);
            return listRight;
        }
        return new ArrayList<>();
    }
