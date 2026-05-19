public class Question2{
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

    // Slow-fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // slow is my midnode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step 3 - check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }


    public boolean isCycle(){ // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast){
                return true; // cycle exists
            }
        }

        return false; // cycle doesn't exists
    }

    // public void removeCycle(){
    //     // detect cycle
    //     Node slow = head;
    //     Node fast = head;
    //     boolean cycle = false;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(fast == slow){
    //             cycle = true;
    //             break;
    //         }
    //     }
    //     if(cycle == false){
    //         return;
    //     }

    //     // find meeting point
    //     slow = head;
    //     // Node prev = fast; // last node
    //     while(slow != fast){
    //         // prev = fast; 
    //         slow = slow.next;
    //         fast = fast.next;
    //     }

    //     // remove cycle -> last.next = null
    //     // prev.next = null;

    // }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // STEP 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle) {
            return;
        }

        // STEP 2: Find cycle start
        slow = head;

        // Special case:
        // cycle starts at head
        if (slow == fast) {

            // move fast until it reaches last node
            while (fast.next != slow) {
                fast = fast.next;
            }

            // break cycle
            fast.next = null;
            return;
        }

        // General case
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // STEP 3: Remove cycle
        fast.next = null;
    }
    
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // to get last node of first half, instead of first node of second half

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(Integer.MIN_VALUE);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left and right mergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        if(head == null){
            return;
        }
        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merging
        Node leftH = head;
        Node rightH = prev;

        Node nextL, nextR;

        while(leftH != null && rightH != null){
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            // update
            leftH = nextL;
            rightH = nextR;
        }
    }

    public void afterMdeleteNnodes(Node head, int m, int n){
        Node temp1 = head;
        while(temp1 != null){

            for(int i = 1; i<m && temp1 != null; i++){
                temp1 = temp1.next;
            }
            if(temp1 == null){
                return;
            }
            Node temp2 = temp1.next;
            for(int i = 1; i<=n && temp2 != null; i++){
                temp2 = temp2.next;
            }
            temp1.next = temp2;
            temp1 = temp2;
        }
    }

    public static void main(String args[]){
        Question2 ll = new Question2();
        ll.addFirst(11);
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        int m = 2;
        int n = 2;
        ll.afterMdeleteNnodes(ll.head, m, n);
        ll.print();
    
    }
}