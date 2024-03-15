import java.util.PriorityQueue;
class Sortinglinklist {
    ReverseLink.Node head;

    class Node {
        int data;
        ReverseLink.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node sort(Node head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Node p = head;

        while (p != null) {
            pq.add(p.data);
            p = p.next;
        }

        p = head;
        while (!pq.isEmpty()) {
            p.data = pq.peek();
            pq.poll();
            p = p.next;
        }

        return head;
    }
}