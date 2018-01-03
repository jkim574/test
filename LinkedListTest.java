public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();


	list.add(new Node(15));
	list.add(new Node(5));
	list.add(new Node(6));
	list.add(new Node(9));
	list.remove_head();
	list.add(new Node(3));
	list.remove_tail();
	list.print();
	list.get(3);
	System.out.println("total length is " + list.len());
    }
}
