package p1;

class J {
    int data;
    J next;

    J(int data){

        this.data = data;
    }
}

public class Linkedlist_1{

    public static void main(String[] args) {

        J value = new J(10);
        J value1 = new J(20);
        J value2 = new J(60);
        J value3 = new J(100);

        J head = value;
        head.next = value1;
        value1.next = value2;
        value2.next = value3;
        value3.next = null;

        Linkedlist_1 r = new Linkedlist_1();
        r.traverse(head);

    }
    public void traverse(J head){

//        J curr = head;

        while(head != null){

            System.out.println(head.data);
            head = head.next;
        }
    }

}
