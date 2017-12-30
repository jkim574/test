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

    public LinkedList(LinkedList next) {
	this.next = next;
    }

    public LinkedList (int data, LinkedList next) {
	this.data = data;
	this.next = next;
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
	    System.out.println("wrong position");
	}
	LinkedList curr = head;
	LinkedList prev = null;
	LinkedList nd = new LinkedList();
	if (curr != null) {
	    curr = head.getNext();
	    while (pos > 0) {
		prev = curr;
		curr = curr.getNext();
		pos--;
	    }
	    if (prev != null) {
		prev.setNext(nd);
		nd.setNext(curr);
	    } else {
		nd.setNext(head.getNext());
		head.setNext(nd);
	    }
	} else {
	    head = num;

	}


    }

    //      public LinkedList remove(int pos) {
    //  }





    public void print() {
	LinkedList curr = head;
       	while (curr.getNext() != null) {
	    System.out.println(curr.data);
	    curr = curr.getNext();

	}
    }

}
