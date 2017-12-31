public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();


	list.add(new LinkedList(15));
	list.add(new LinkedList(5));
	list.add(new LinkedList(6));
	list.add(new LinkedList(9));
	list.remove_head();
	//   	list.add(new LinkedList(2),2);
       	list.add(new LinkedList(3));
	//	list.remove_last();
	list.print();
	System.out.println("total length is " + list.len());
    }
}
