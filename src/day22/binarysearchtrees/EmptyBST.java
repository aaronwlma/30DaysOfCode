package day22.binarysearchtrees;

public class EmptyBST<D extends Comparable> implements Tree<D> {

	// Constructor
	public EmptyBST() {
		
	}
	
	// Methods
	public boolean isEmpty() {
		return true;
	}
	
	public int cardinality() {
		return 0;
	}
	
	public boolean member(D elt) {
		return false;
	}
	
	public NonEmptyBST<D> add(D elt) {
		return new NonEmptyBST<D>(elt);
	}
}
