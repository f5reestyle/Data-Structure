
public class MyQueue<E> implements Queue<E> {

	private Node<E> first = null;
	private Node<E> last = null;
	private int size = 0;

	@Override
	public void enqueue(E item) {
		if (first==null){
			first = last = new Node<E>(item, null, null);
			size++;
			return;
		}
		last.setRight(new Node<E>(item, last, last.getRight()));
		last = last.getRight();
		size++;
	}

	@Override
	public E dequeue() {
		if(first==null){
			return null;
		}
		E result = first.getItem();
		first = first.getRight();
		if (first==null){
			last = first;
		}else{ first.setLeft(null);}
		size--;
		return result;
	}

	@Override
	public E pop() {
		if(first==null){
			return null;
		}
		E result = last.getItem();
		last = last.getLeft();
		if (last ==null) {
			first = last;
		}else{ last.setRight(null); }
		size--;
		return result;
	}

	@Override
	public void clear() {
		first = last = null;
		size = 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String toString() {
		Node<E> cursor = first;
		StringBuffer sb = new StringBuffer("(");
		while (cursor != null) {
			sb.append(cursor.getItem());
			if (cursor != last) {
				sb.append(' ');
			}
			cursor = cursor.getRight();
		}
		sb.append(")");
		return sb.toString();
	}

}
