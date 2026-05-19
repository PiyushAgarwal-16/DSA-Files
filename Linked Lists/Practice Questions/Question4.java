public class Question4{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){ // if linkedlist is empty
            head = tail = newNode;
            return;
        }

        // step2 -> newNode's Next = head
        newNode.next = head; // link

        // step3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){ // if linkedlist is empty
            head = tail = newNode;
            return;
        }

        // step2 -> newNode's Next = tail
        tail.next = newNode; // link

        // step3 -> tail = newNode
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked List is empty.");
        }
        Node iterator = head;

        while(iterator != null){
            System.out.print(iterator.data + " -> ");
            iterator = iterator.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
            // because handling head is important
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE; // returning -infinity
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        int i = 0;

        while(i < size-1){ // Because prev already starts at index 0, you need size-2 steps to reach second last
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key){
        Node temp = head;
        int index = 0;

        while (temp != null){
            if(temp.data == key){ // key found 
                return index;
            }
            temp = temp.next;
            index++;
        }


        // key not found
        return -1;
    }

    public int helperRecursiveSearch(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helperRecursiveSearch(head.next, key);
        
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    public int recursiveSearch(int key){
        return helperRecursiveSearch(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head; // updating the tail now 
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // we can use the parameter we initialized
        // or we can calculate the size of the linkedlist

        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){ // means deleting the head
            head = head.next; // removeFirst
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;

        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next; 

    } 

   // Better solution by ChatGPT:

   public void swapKeys2(Node head, int x, int y) {

    if (x == y) return;

    Node prevX = null, currX = head;
    Node prevY = null, currY = head;

    while (currX != null && currX.data != x) {
        prevX = currX;
        currX = currX.next;
    }

    while (currY != null && currY.data != y) {
        prevY = currY;
        currY = currY.next;
    }

    if (currX == null || currY == null) {
        System.out.println("Keys not present");
        return;
    }

    // Change previous pointers
    if (prevX != null)
        prevX.next = currY;
    else
        this.head = currY;

    if (prevY != null)
        prevY.next = currX;
    else
        this.head = currX;

    // Swap next pointers
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
} 
    public void evenBeforeOdd(){
        Node prevX = null;
        Node currX = null;
        Node prevY = null;
        Node currY = head;

        while(currY.data % 2 == 0 && currY != null){
            prevY = currY;
            currY = currY.next;
        }
        prevX = prevY;
        currX = currY;

        while(currY != null){
            if(currY.data % 2 == 0 ){
                if(prevX == null){
                    prevY.next = currY.next;
                    currY.next = currX;
                    this.head = currY;
                }
                else{
                    Node temp = currY.next;
                    currY.next = currX;
                    prevX.next = currY;
                    prevY.next = temp;
                }

                prevX = currY;
                currX = currY.next;
            }
            prevY = currY;
            currY = currY.next;
        }
    }

    // better approach by chatgpt
    public void evenBeforeOdd2() {

    if (head == null) return;

    Node evenHead = null, evenTail = null;
    Node oddHead = null, oddTail = null;

    Node curr = head;

    while (curr != null) {

        if (curr.data % 2 == 0) {

            if (evenHead == null) {
                evenHead = evenTail = curr;
            } else {
                evenTail.next = curr;
                evenTail = curr;
            }

        } else {

            if (oddHead == null) {
                oddHead = oddTail = curr;
            } else {
                oddTail.next = curr;
                oddTail = curr;
            }
        }

        curr = curr.next;
    }

    if (evenHead == null) {
        head = oddHead;
        return;
    }

    evenTail.next = oddHead;

    if (oddTail != null)
        oddTail.next = null;

    head = evenHead;
}
    public static void main(String args[]){
        Question4 ll = new Question4();
        // ll.addFirst(8);
        // ll.addFirst(7);
        // ll.addFirst(5);
        // ll.addFirst(3);
        // ll.addFirst(1);
        // ll.addFirst(6);
        // ll.addFirst(4);
        // ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(5);

        ll.print();
        ll.evenBeforeOdd2();
        ll.print();
    
    }
}