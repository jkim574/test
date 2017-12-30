public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.add(new LinkedList(5));
	list.add(new LinkedList(6));
	list.add(new LinkedList(9));
	list.add(2,new LinkedList(2));
	list.print();
	System.out.println("total length is " + list.len());
    }
}
