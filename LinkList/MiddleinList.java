class MiddleinList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //add Node
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //printlist
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //Finding nth node
    public int nthNode(){
        if(head == null){
            System.out.println("List empty");
            return head.data;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    //main
    public static void main(String[] args) {
        MiddleinList list = new MiddleinList();
        list.addNode(6);
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        list.printlist();
        System.out.println(list.nthNode());


    }
}