public class Question3{
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

    public void swapKeys(Node head, int key1, int key2){
        Node curr = head, temp1 = head, temp2 = head, temp3 = head, temp4 = head, t = null;
        while(curr != null && curr.next != null){
            if(key1 == curr.data){
                temp1 = t;
                temp2 = curr;
            }
            if(key2 == curr.data){
                temp3 = t;
                temp4 = curr;
            }
            t = curr;
            curr = curr.next;
        }
        if(temp2 == null || temp4 == null){
            System.out.println("keys not present");
            return;
        }
        if(temp3 == null){
            temp3 = temp1;
            temp1 = temp2;
            temp2 = temp4;
            temp4 = temp1;
            temp1 = null;
        }
        if(temp1 == null || temp3 == null){
            Node temp = temp2.next;
            temp2.next = temp4.next;
            temp4.next = temp;
            temp3.next = temp2;
            this.head = temp4;
            return;
        }
        if(temp2 == temp3){ // consecutive nodes
            temp1.next = temp4;
            temp2.next = temp4.next;
            temp4.next = temp2;
            return;
        }
        Node temp5 = temp2.next;
        temp2.next = temp4.next;
        temp4.next = temp5;
        temp1.next = temp4;
        temp3.next = temp2;
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


    public static void main(String args[]){
        Question3 ll = new Question3();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.swapKeys(ll.head, 5,1);
    
        ll.print();
    
    }
}