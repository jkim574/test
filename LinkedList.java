public class LinkedList {
    private int data;
    private LinkedList next;
    private LinkedList head;

    public LinkedList(int data, LinkedList next, LinkedList head) {
	this.data = data;
	this.next = next;
	this.head = head;
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

    public void add(LinkedList data) {
	LinkedList nd = new LinkedList(data);
	LinkedList curr = head;
	if (curr != null) {
	    while (curr.getNext() != null) {
		curr = curr.getNext();
	    }
	    curr.setNext(data);
	} else {
	    head = data;
	}


    }


}
