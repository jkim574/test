public class LinkedList {
    private Node head;

    public LinkedList() {
	head = null;
    }

    public int len() {
	int length = 0;
        Node curr = head;
	while (curr != null) {
	    curr = curr.getNext();
	    length++;
	}
	return length;
    }

    public void add(Node item) {
	Node curr = head;
	if (curr != null) {
	    while (curr.getNext() != null) {
		curr = curr.getNext();
	    }
	    curr.setNext(item);
	} else {
	    head = item;
	}
    }

    public void add(Node item, int pos) {
	int count = 0;
        Node curr = head;
        if (pos == 0) {
	    item.setNext(head);
	    this.head = item;
	}

	while (curr != null) {
	    count++;
	    if (count == pos) {
		break;
	    }
	    curr = curr.getNext();
	}
	Node cpy = curr.getNext();
	curr.setNext(item);
	item.setNext(cpy);

    }

    public Node get(int pos) {
	Node curr = head;
	if (curr != null) {
	    curr = curr.getNext();
	    while (pos > 0) {
		curr = curr.getNext();
		pos--;
	    }

	    return curr.getData();
	}
	return null;
    }

    public Node remove_head() {
	if (this.head == null) {
	    return null;
	}
	this.head = head.getNext();
	return head;
    }

    public void remove_tail() {
	Node curr = this.head;
	Node prev = null;
	if (head == null) {
	    return;
	}
	while (curr.getNext() != null) {
	    prev = curr;
	    curr = curr.getNext();
	}
	prev.setNext(null);


    }

    public void print() {
        Node curr = this.head;
       	while (curr != null) {
	    System.out.println(curr.getData());
	    curr = curr.getNext();
	}
    }

}
