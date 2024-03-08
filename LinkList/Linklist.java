import java.lang.String;
class Linklist {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head; //points first element initially
        Node lastNode = head.next; //points second element initially
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next = null;
    }
    //printing linklist
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
        Linklist list = new Linklist();
        list.addFirst("is");
        list.addFirst("Sujal");
        list.printList();
        list.addLast("good");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}