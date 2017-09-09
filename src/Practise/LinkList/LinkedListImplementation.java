package Practise.LinkList;

public class LinkedListImplementation {
	
	public static void main(String args[]) {
		
		LinkList ll = new LinkList();
		
		ll.insertElement(5);
		ll.insertElement(6);
		ll.insertElement(10);
		System.out.println("After insert");
		ll.printLinkList();
		
		//ll.deleteElement(10);
		//ll.deleteElement(6);
		ll.deleteElement(5);
		System.out.println("After Delete");
		ll.printLinkList();
	}

}

class Node {
	public int data;
	public Node next;
	
	public void displayNode() {
		System.out.println("{" + data + "}");
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkList{
	private Node head;
	
	public void insertElement(int ele) {
		Node newNode = new Node(ele);
		newNode.next = head;
		head = newNode;
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
	
	public void printLinkList(){
		Node current = head;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
	}
}
