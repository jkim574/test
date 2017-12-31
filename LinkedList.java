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

    public void add(LinkedList num, int pos) {
	int length = len();
	int count = 0;
	if (pos > length || pos < 0) {
	    System.out.println("wrong position");
	}
	LinkedList curr = head;
        if (pos == 0) {
	    num.setNext(head);
	    this.head = num;
	}

	while (curr != null) {
	    count++;
	    if (count == pos) {
		break;
	    }
	    curr = curr.getNext();
	}
	LinkedList cpy = curr.getNext();
	curr.setNext(num);
	num.setNext(cpy);

    }

    public LinkedList remove_head() {
	if (this.head == null) {
	    return null;
	}
	this.head = head.getNext();
	return head;
    }







    public void print() {
	LinkedList curr = this.head;
       	while (curr.getNext() != null) {
	    System.out.println(curr.data);
	    curr = curr.getNext();
	}
    }

}
