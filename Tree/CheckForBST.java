    Node prev=null;
    boolean flag = true;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
       inorder(root);
       return flag;
    }
    
    
    void inorder(Node root){
        if(root==null){
            return;
        }
        
        inorder(root.left);
        
        if(prev==null) prev=root;
        
        else if(prev.data>=root.data){
            flag = false;
        }
        
        else {
               prev=root;
        }
        
        inorder(root.right);
        
        
    }
