//Problem

/*Find Node With Maximum Subtree Sum*/

//Solution

    static Node maxNode = null;
    static int maxSum = Integer.MIN_VALUE;
    public static int nodeWithMaxSubtreeSum(Node node){
        int sum = node.data;
        for(Node child : node.children){
           sum += nodeWithMaxSubtreeSum(child);
        }

        if(sum>maxSum){
            maxSum = sum;
            maxNode = node;
        }
        return sum;
    }
