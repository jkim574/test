public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.add(new LinkedList(5));
	System.out.println(list.len());
    }
}
