package day27.testing;

public interface Tree<D extends Comparable> {

	// Signatures
	public boolean isEmpty();
	public int cardinality();
	public boolean member(D elt);
	public NonEmptyBST<D> add(D elt);
	
}
