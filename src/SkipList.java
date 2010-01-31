import java.util.ArrayList;

public class SkipList<T extends Comparable<? super T>> {
	private Node root = null;

	public SkipList() {

	}

	public SkipList(int[] start) {

	}

	public boolean insert(T item) {
		return true;
	}

	public boolean remove(T item) {
		return true;
	}

	public int getNodesVisited() {
		return 0;
	}

	public Node getRoot() {
		return this.root;
	}

	public class Node {
		private T element = null;

		public Node() {

		}

		public ArrayList<Node> getLinks() {
			return new ArrayList<Node>();
		}

		public T getElement() {
			return element;
		}

	}
}
