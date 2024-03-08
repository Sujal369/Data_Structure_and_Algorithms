class ReverseLink{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    //reverse Link List using iterative
    public void reverseLink(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            printList();
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;

        }
        head.next = null;
        head = prev;
    }
    //reverse string using recursion
//    public Node reverseRecursive(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        Node newHead = reverseRecursive(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
    //adding
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //printing
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL\n");
    }
    public static void main(String[] args) {
        ReverseLink list = new ReverseLink();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
        list.reverseLink();
        list.printList();
    }
}