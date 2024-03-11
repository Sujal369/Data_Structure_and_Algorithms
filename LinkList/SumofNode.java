class SumofNode
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
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
    //sum of all data
    public void sumofNodes(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        int sum = 0;
        Node curr = head;
        while(curr!=null){
            sum = sum + curr.data;
            curr = curr.next;
        }
        System.out.println("Sum of all elements is "+sum);
    }
    public static void main(String[] args) {
        SumofNode list = new SumofNode();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.printList();
        list.sumofNodes();
}
}

