public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.add(new LinkedList(5));
	list.add(new LinkedList(6));
	list.add(new LinkedList(9));
	System.out.println(list.len());
	System.out.println(list.toString());
    }
}
