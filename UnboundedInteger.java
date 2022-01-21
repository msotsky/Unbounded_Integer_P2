/*
Maxime Sotsky
COMP 2611
Nov 10 1pm 2020
*/
public class UnboundedInteger {

    private static class Node 
    {
		private int data;
		private Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
		public Node (int data, Node next){
			this.data = data;
			this.next = next;
		}
		
		public int getData(){
			return this.data;
		}
		
		public void setData(int data){
			this.data = data;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		public void setNext(Node node){
			this.next = node; 
		}

    }

	private int size;
	private Node head;
	
	public UnboundedInteger(){
		size = 0;
		head = null;
    }
    public void assignValue(String num)
	{
		int i = 0;
		if (num.charAt(0) == '-')
			i++;
		for(; i != num.length(); i++)
			this.addFirst(Character.getNumericValue(num.charAt(i)));
		if (num.charAt(0) == '-')
			this.addFirst(-1);
		else
			this.addFirst(1);		
	}	
	
    public String toString() { 
	    Object obj;
	    String result = "[  ";
	    Node current = head;

	    while (current != null) {
	      obj = current.data;
	      result = result + obj.toString() + "  ";
	      current = current.next;
	    }
	    result = result + "]";
	    return result;
      }

    public int getSize(){
		return size;
	}

	public boolean isEmpty(){
		return head ==null;
	}
	
	public int getDataAt(int index) {
        Node cur;
        if ((index < 1) || (head == null))
            return 0;
        else{
            cur = head;
            while (index > 1) {
                cur = cur.getNext();
                if (cur == null)
                    return 0;
                index--;
            }
            return cur.getData();
        }
	}
	
	public void addFirst(int item) {
		head = new Node(item,head);
		size++;
	}

	public void addLast(int num) {
        if (head == null)
            head = new Node(num);
        else{
            Node node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Node(num));
        }
        size++;
	}

	public int deleteFirst(){
		if (isEmpty()) {
			return 0;
		}
		else{
			int element = head.getData();
			head = head.getNext();
			size--;
			return element;
		}
	}
	
    public void deleteLast(){
        Node node = head; 
        while (node.getNext().getNext() != null){
            node = node.getNext();
		}
		size--;
        node.setNext(null);
	}

	public void clear(){
		while(this.isEmpty() == false)
			this.deleteFirst();
			size = 0;
	}

	public int getLast(){ 
		Node node = head;
        while (node.getNext().getNext() != null){
            node = node.getNext();
		}
		return node.getNext().getData();
	}
	
}