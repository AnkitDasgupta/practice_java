package p1;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
    }
}


public class Linkedlist {
    public static void main(String[] args) {

        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);

        Node head = n;
        head.next = n1;
        n1.next = n2;
        n2.next = null;

         Linkedlist values = new Linkedlist();

          values.traverse(head);

    }
    public void traverse(Node head){

        while(head!= null){

            System.out.println(head.data);
            head = head.next;
        }
    }
}

