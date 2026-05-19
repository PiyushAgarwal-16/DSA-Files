public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size; 

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        // if linkedlist is empty: head == null
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty.");
            return Integer.MIN_VALUE;
        }

        if(head.next == null){ // Single element
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null; // this line would cause error if there is only single element because then the head would become null and there is no prev attribute in null
        size--;
        return val;
    }

    // print
    public void print(){
        if(head == null){
            System.out.println("Linkedlist is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        // if linkedlist is empty: head == null
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // removeLast
        public int removeLast(){
        if(head == null){
            System.out.println("Linked List is empty.");
            return Integer.MIN_VALUE;
        }

        if(head.next == null){ // Single element
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void reverse(){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            currNode.prev = nextNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);

        dll.print();
        // dll.removeFirst();
        // dll.removeLast();
        dll.reverse();
        dll.print();
    }
}