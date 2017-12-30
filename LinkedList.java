public class LinkedList {
    private int data;
    private LinkedList next;
    private LinkedList head;

    public LinkedList() {
	head = null;
    }

    public LinkedList(int data) {
	this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public int getData() {
	return data;
    }

    public void setNext(LinkedList next) {
	this.next = next;

    }

    public void setData(int data) {
	this.data = data;
    }

    public int len() {
	int length = 0;
	LinkedList curr = head;
	while (curr != null) {
	    curr = curr.getNext();
	    length++;
	}
	return length;
    }

    public void add(LinkedList num) {
	LinkedList nd = new LinkedList();
	LinkedList curr = head;
	if (curr != null) {
	    while (curr.getNext() != null) {
		curr = curr.getNext();
	    }
	    curr.setNext(num);
	} else {
	    head = num;
	}
    }

    public void add(int pos, LinkedList num) {
	int length = len();
	if (pos > length || pos < 0) {
	    System.out.println("wrong index");
	}
	LinkedList curr = head;
	LinkedList prev = null;
	if (curr != null) {

	} else {

	}


    }

    public void print() {
	LinkedList curr = head;

	while (curr.getNext() != null) {
	    curr = curr.getNext();
	}
	System.out.println(curr);
    }

}
