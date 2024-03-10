class HasCycle{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Link list cycle check
    public static boolean hasCycle(Node head){
        if(head==null) return false;
        Node hare = head;
        Node turtle = head;
        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle){
                return true;
            }
        }
        return false;
    }
    //add function
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //printing
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //main
    public static void main(String[] args) {
        HasCycle list = new HasCycle();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
        System.out.print(hasCycle(list.head));
    }
}