public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();


	list.add(3);
	list.add(5);
	list.add(7);
	list.add(9);
	list.add(3,2);
	//   list.remove_head();
	//        list.remove_tail();
        list.print();
	//	list.get(3);
	System.out.println("total length is " + list.len());
    }
}
