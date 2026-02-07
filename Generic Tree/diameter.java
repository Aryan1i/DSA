//Problem

/*Find the diameter of a generic tree*/

//Solution

static int diameter = 0;
    public static int diameter(Node node){
        int dch = -1;
        int sdch = -1;

        for(Node child: node.children){
            int ch = diameter(child);
            if(ch>dch){
                sdch = dch;
                dch = ch;
            }else if (ch>sdch){
                sdch = ch;
            }
        }

        int candidate = dch + sdch + 2 ;

        if(candidate > diameter){
            diameter = candidate;
        }

        dch+=1;
        return dch;
    }
