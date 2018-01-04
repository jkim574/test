public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
	head = null;
    }

    public int len() {
	int length = 0;
        Node<T> curr = head;
	while (curr.getNext() != null) {
	    curr = curr.getNext();
	    length++;
	}
	return length;
    }

    public void add(T item) {
	Node<T> node = new Node<T>(item);
	Node<T> curr = head;
	if (curr != null) {
	    while (curr.getNext() != null) {
		curr = curr.getNext();
	    }
	    curr.setNext(node);
	} else {
	    head = node;
	}
    }

    public void add(int pos, T item) {
	 Node<T> node = new Node<T>(item);
	 Node<T> curr = head;
	 Node<T> prev = null;
	 if (curr != null) {
	     while (pos > 1) {
		 prev = curr;
		 curr = curr.getNext();
		 pos--;
	     }
	     if (prev != null) {
		 //System.out.println(prev.getData());
		 prev.setNext(node);
		 node.setNext(curr);
	     } else {
		 node.setNext(head.getNext());
		 head.setNext(node);
	     }
	 } else {
	     head.setNext(node);
	 }



     }

    public T get(int pos) {
	Node<T> curr = head;
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

    public void remove_head() {
	if (head == null) {
	    return;
	}
	head = head.getNext();
    }

    public void remove_tail() {
	Node<T> curr = this.head;
	Node<T> prev = null;
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
        Node<T> curr = this.head;
       	while (curr != null) {
	    System.out.println(curr.getData());
	    curr = curr.getNext();
	}
    }

}
