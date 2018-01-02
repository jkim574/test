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
	int length = len();
	int count = 0;
	if (pos > length || pos < 0) {
	    System.out.println("wrong position");
	}
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

    public Node remove_head() {
	if (this.head == null) {
	    return null;
	}
	this.head = head.getNext();
	return head;
    }


    public void print() {
        Node curr = this.head;
       	while (curr.getNext() != null) {
	    System.out.println(curr.getData());
	    curr = curr.getNext();
	}
    }

}
