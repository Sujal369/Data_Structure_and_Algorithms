class CountsANode
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
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static int countNode(Node root){
        if(root == null) return 0;
        int countleft = countNode(root.left);
        int countright = countNode(root.right);
        return countleft+countright+1;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,5,3,6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(countNode(root));
    }
}