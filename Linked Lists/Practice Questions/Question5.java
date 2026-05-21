public class Question5{
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

    public static Node merge2SortedLL(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dNode = new Node(-1);

        Node temp = dNode;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }

            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }

            if(t1 != null){
                temp.next = t1;
            }
            else{
                temp.next = t2;
            }
        }
        return dNode.next;
    }

    public static Node mergeKSortedLL(Node arr[]){
        Node head = arr[0];
        for(int i = 1; i<arr.length; i++){
            head = merge2SortedLL(head, arr[i]);
        }
        return head;
    }

    public static void main(String[] args) {
        Question5 ll = new Question5();
        Question5 ll2 = new Question5();
        Question5 ll3 = new Question5();
        Question5 ll4 = new Question5();
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(10);

        ll2.addLast(1);
        ll2.addLast(3);
        ll2.addLast(3);
        ll2.addLast(6);
        ll2.addLast(11);
        ll2.addLast(14);

        ll3.addLast(4);
        ll3.addLast(9);
        ll3.addLast(10);
        ll3.addLast(16);
        ll3.addLast(20);

        ll4.addLast(21);
        ll4.addLast(22);
        ll4.addLast(23);
        ll4.addLast(24);

        // ll.print();
        // ll2.print();

        Node arr[] = {ll.head, ll2.head, ll3.head, ll4.head};
        Node temp = mergeKSortedLL(arr);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");

    }
}