//Problem

    //Given a positive integer n, return the nth row of pascal's triangle.
    //Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

//Solution

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        if (n == 1) return list;
        
        list.add(1);
        list.add(1);
        
        int ele = n * (n + 1) / 2;
        int level = 3;
        while(list.size() < ele){
            list.add(1);
            for(int i = 0; i < level - 2; i++){
                list.add(list.get(list.size() - level + 1) + list.get(list.size() - level));
            }
            list.add(1);
            level++;
        }
        
        
        return new ArrayList<>(list.subList(ele - n, ele));
    }
}
