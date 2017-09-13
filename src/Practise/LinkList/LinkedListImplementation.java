package Practise.LinkList;

public class LinkedListImplementation {
	
	public static void main(String args[]) {
		
		LinkList ll = new LinkList();
		
		ll.insertElement(5);
		ll.insertElement(6);
		ll.insertElement(10);
		System.out.println("After insert");
		ll.printList(ll.head);;
		//Node head = ll.getHead();
		Node head = ll.reverseList(ll.head);
	
		//ll.deleteElement(10);
		//ll.deleteElement(6);
		//ll.deleteElement(5);
		System.out.println("After reverse");
		ll.printList(head);
	}

}

class Node {
	public int data;
	public Node next;
	
	public void displayNode() {
		System.out.print(" {" + data + "} ");
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkList{
	public Node head;
	
	public void insertElement(int ele) {
		Node newNode = new Node(ele);
		newNode.next = head;
		head = newNode;
	}
	
	public Node getHead() {
		Node temp = head;
		return head;
	}
	
	
	public void deleteElement(int ele){
		Node temp = head;
		Node prev = null;
		/*//first node
		if (temp != null && temp.data==ele) {
			head = temp.next;
			System.out.println("Node deleted from head");
			return;
		}*/
		//if node is mid or last
		while (temp != null && temp.data!=ele) {
			prev = temp;
			temp= temp.next;
		}
		if(temp==null) {
			System.out.println("Node doesn't exist");
			return;
		}
		prev.next = temp.next;
		System.out.println("After deleting the node");
	}
	
	public Node reverseList(Node head) {
		Node current = head;
		Node next = null;
		Node previous = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}
	
	public void printLinkList(){
		Node current = head;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	void printList(Node node) {
		Node current = node;
        while (current != null) {
        	current.displayNode();
            current = current.next;
        }
    }
}
