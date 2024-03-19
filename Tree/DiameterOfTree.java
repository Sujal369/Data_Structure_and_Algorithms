class DiameterOfTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        //diameter of tree
        public static int diameter(Node root){
            if(root == null) return 0;
            int diamleft = diameter(root.left);
            int diamright = diameter(root.right);
            int diam3 = diameter(root.left) + diameter(root.right) + 1;

            return Math.max(diam3,Math.max(diamleft,diamright));
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(tree.diameter(root));

    }
}