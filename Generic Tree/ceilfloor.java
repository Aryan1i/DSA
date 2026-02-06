//Problem

/* find ceil and floor in generic tree*/

//solution

static int floor = Integer.MIN_VALUE;
static int ceil = Integer.MAX_VALUE;

public static void ceilfloor(Node node, int data){

    if(node.data < data){
        if(node.data > floor){
            floor = node.data;
        }
    }
    else if(node.data > data){
        if(node.data < ceil){
            ceil = node.data;
        }
    }

    for(Node child : node.children){
        ceilfloor(child, data);
    }
}
