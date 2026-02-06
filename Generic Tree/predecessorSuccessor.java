//Problem

/*find Predecessor Successor in generic tree*/

//Solution

static Node predecessor = null;
static Node successor = null;
static int state = 0;

public static void predecessorSuccessor(Node node, int data) {

    if(state == 2) return;

    if(state == 0){
        if(node.data == data){
            state = 1;
        } else {
            predecessor = node;
        }
    }
    else if(state == 1){
        successor = node;
        state = 2;
        return;
    }

    for(Node child : node.children){
        predecessorSuccessor(child, data);
    }
}
