package day21.generics;

import java.util.LinkedList;

public class LinkedListUS<D/*, T extends Comparable<T>*/> {

	// Properties
	Node<D> head;
	int count;
	
	// Constructors
//	public LinkedList() {
//		head = null;
//		count = 0;
//	}
	
	public LinkedListUS(Node<D> newHead) {
		head = newHead;
		count = 1;
	}
	
	// Methods
	
	//add (adds to the front of the list)
	public void add(D newData) {
		Node<D> temp = new Node(newData);
		Node<D> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	
	//get
	public D get(int index) {
//		if (index <= 0) {
//			return -1;
//		}
		Node<D> current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	//size
	public int size() {
		return count;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	//remove (removes from back of the list)
	public void remove() {
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	// Main Method
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Alice");
		System.out.println(linkedList);
		linkedList.add("Alicey");
		System.out.println(linkedList);
		
	}
}