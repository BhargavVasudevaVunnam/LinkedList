class Node{
	int data;
    Node next;
	Node(int n){
		this.data=n;
		next=null;
	}
}
public class LinkedList {
Node Head=null;
Node spare;
void add(int n) {
	Node x=new Node(n);
	if(Head==null) {
		Head=x;
		return;
	}
	else {
		spare=Head;
		while(spare.next!=null) {
			spare=spare.next;
		}
		spare.next=x;
	}
}
Node removebyindex(int index) {
	Node previousnode=null;
	Node currnode=Head;
	int c=1;
	if(currnode==null) {
		System.out.println("Linked List is empty");
		return null;
	}
	else if(index==1) {
		if(Head.next!=null) {
		Head=Head.next;
		}
		else {
			Head=null;
		}
	}
	else {
		while(true) {
		if(c==index) {
			System.out.println("deleted data "+currnode.data);
			previousnode.next=currnode.next;
			if(currnode.next==null)
				break;
			break;
		}
		else {
			if(currnode.next==null) {
				System.out.println("Position out of bounds");
				break;
			}
			previousnode=currnode;
			currnode=currnode.next;
			c++;
		}
		}
	}
	
	
	return null;
}
void removebykey(int key) {
	if(Head==null) {
		System.out.println("List is empty return null");
	}
	else {
		Node current=Head;
		Node previous=null;
		int c=0,m=0;
		while(current!=null) {
			c++;
			if(current.data==key) {
				if(c==1) {
					Head=Head.next;
					m=1;
					break;
				}
				else {
					previous.next=current.next;
					m=1;
					break;
				}
			}
			else {
			previous=current;
			current=current.next;
			}
		}
		if(m!=1) {
			System.out.println("Element not found");
		}
	}
}
void show() {
	Node traverse=Head;
	while(true) {
		if(traverse==null) {
			System.out.println("Linked List Empty");
			break;
		}
		else {
			System.out.print(traverse.data+" ");
			if(traverse.next==null) {
				System.out.println();
				break;
			}else {
				traverse=traverse.next;
			}
		}
	}
}
}
