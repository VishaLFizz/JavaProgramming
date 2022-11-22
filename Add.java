package LinkedList;

public class AddFirst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Add first function
    public void addFirst(int data){
        //Step1 - create a new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        //Step2 - newNode next = head
        newNode.next = head;  //Link step

        //Step3 - head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
      
        ll.addFirst(2);
        ll.addFirst(1);
       
        

    }
    
}