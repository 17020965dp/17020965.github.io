package LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.head);
        list.addFirst(new Node(10));
        list.addFirst(new Node(20));
        list.addFirst(new Node(30));
        list.addFirst(new Node(40));
        System.out.println(list.head);
    }
}
