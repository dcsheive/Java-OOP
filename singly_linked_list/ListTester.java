public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        System.out.println(sll.find(3));
        System.out.println(sll.find(10));
        System.out.println(sll.find(6));
        sll.removeAt(0);
        sll.printValues();
        sll.removeAt(1);
        sll.printValues();
        sll.removeAt(1);
        sll.printValues();
    }
}