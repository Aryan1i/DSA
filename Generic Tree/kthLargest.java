//Problem

/*find Kth largest in generic tree*/

//Solution

static int floor = Integer.MIN_VALUE;
    static int ceil = Integer.MAX_VALUE;

    public static void ceilfloor(Node node,int data){
        if(node.data<data){
            if(node.data>floor){
                floor=node.data;
            }
        }
        
        if(node.data>data){
            if(node.data<ceil){
                ceil=node.data;
            }
        }

        for(Node child : node.children){
            ceilfloor(child, data);
        }
    }

    public static int kthLargest(Node node , int k){
        floor = Integer.MIN_VALUE;
        int factor = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            ceilfloor(node, factor);
            factor = floor;
            floor = Integer.MIN_VALUE;
        }
        return factor;
    }
