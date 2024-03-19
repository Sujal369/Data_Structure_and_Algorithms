class SumofleafNodes
{
    static class Node{
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
        static int sum;
        public static int sumofleafs(Node root){
            if(root == null) return 0;
            if(root.left == null && root.right == null){
                sum += root.data;
            }
            sumofleafs(root.left);
            sumofleafs(root.right);
            return sum;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(tree.sumofleafs(root));

    }
}