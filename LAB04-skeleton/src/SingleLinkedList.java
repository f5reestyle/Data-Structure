/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
 */

/** Linked list implementation */
class SingleLinkedList<E> implements List<E> {
	private Link<E> head;         // Pointer to list header
	private Link<E> tail;         // Pointer to last element
	protected Link<E> curr;       // Access to current element
	int cnt = 0;		      // Size of list

	/** Constructors */
	SingleLinkedList(int size) { this(); }   // Constructor -- Ignore size
	SingleLinkedList() {

	}

	/** Insert "it" at (pos) position */
	public void insert(int pos, E it) {
		// fill your code here
		if(pos>cnt+1){
			System.out.print("INVALID");
			return;
		}
		if (cnt==0)
			curr=head=tail= new Link<E>(null);

		Link<E> temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next();
		}
		temp.setNext(new Link<E>(it,temp.next()));

		cnt++;
		System.out.print(pos+", "+it);

	}

	/** Remove an element at (pos) position*/
	public void remove(int pos) {
		// fill your code here
		if(pos>cnt){
			System.out.print("INVALID");
			return;
		}
		Link<E> temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next();
		}
		E item = temp.next().element();
		temp.setNext(temp.next().next());
		cnt--;
		System.out.print(pos+", "+item);

	}

	/** @return an element value at (pos) position*/
	public E getValue(int pos) {
		// fill your code here
		if(pos>cnt) return null;
		Link<E> temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next();
		}
		E item = temp.next().element();
		return item;
	}

	/** Print all the values in the list*/
	public void printAll() { // simply print all the elements inside
		// fill your code here
		Link<E> temp = head;
		for (int i = 0; i < cnt; i++) {
			temp=temp.next();
			System.out.print(temp.element()+" ");
		}


	}
	/** Update element at (pos) position*/
	public void update(int pos, E item){
		// fill your code here
		if(pos>cnt){
			System.out.print("INVALID");
			return;
		}
		Link<E> temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next();
		}
		temp.setNext(new Link<E>(item,temp.next().next()));
		System.out.print(pos+", "+item);


	}
	/** @return List length */
	public int length() {
		// fill your code here
		return cnt;
	}
}