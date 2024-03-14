public class StackusingLinklist
{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            StackusingLinklist.Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }
        public static void main(String[] args) {
          Stack s = new Stack();
          s.push(1);
          s.push(2);
          s.push(3);
          while (!s.isEmpty()){
              System.out.println(s.peek());
              s.pop();
        }
    }
}