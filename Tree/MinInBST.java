class Solution {
    // Function to find the minimum element in the given BST.
int minValue(Node root) {
        int minV = root.data;
        
        while(root!=null){
            minV = Math.min(minV,root.data);
            root = root.left;
        }
        return minV;
    }
}
