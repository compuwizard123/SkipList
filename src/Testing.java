import java.util.ArrayList;
import junit.framework.*;

public class Testing extends TestCase{
	private static int points = 0;

	public void testInsert(){
		int[] rnums = {0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0};
		SkipList<Integer> s = new SkipList<Integer>(rnums);

		s.insert(5);
		s.insert(7);
		s.insert(6);
		s.insert(6);
		s.insert(4);
		int nv1 = s.getNodesVisited();
		s.insert(8);
		int nv2 = s.getNodesVisited();
		assertEquals(2, nv2-nv1);
		
		ArrayList<SkipList<Integer>.Node> links = s.getRoot().getLinks();
		ArrayList<Integer> vals = new ArrayList<Integer>();
		vals.add(4);
		vals.add(4);
		vals.add(4);
		vals.add(6);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(5);
		vals.add(6);
		vals.add(6);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}

		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(6);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}
		

		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(6);
		vals.add(6);
		vals.add(7);		
		vals.add(null);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(7);
		vals.add(7);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}

		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(8);
		vals.add(8);
		vals.add(8);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(null);
		vals.add(null);
		vals.add(null);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}
		
		points += 30;
	}
	
	public void testRemove(){
		int[] rnums = {0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0};
		SkipList<Integer> s = new SkipList<Integer>(rnums);

		assertTrue(s.insert(5));
		assertTrue(s.insert(9));
		assertTrue(s.insert(8));
		assertTrue(s.insert(7));
		assertTrue(s.insert(4));
		assertTrue(s.insert(10));
		assertFalse(s.remove(11));
		assertFalse(s.remove(6));
		int nv1 = s.getNodesVisited();
		assertTrue(s.remove(7));

		int nv2 = s.getNodesVisited();
		assertEquals(2, nv2-nv1);
		
		ArrayList<SkipList<Integer>.Node> links = s.getRoot().getLinks();
		ArrayList<Integer> vals = new ArrayList<Integer>();
		vals.add(4);
		vals.add(4);
		vals.add(4);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		vals.add(null);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(5);
		vals.add(8);
		vals.add(9);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}

		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(8);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}
		

		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(9);
		vals.add(9);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(10);
		vals.add(10);
		vals.add(10);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			assertEquals(vals.get(i), links.get(i).getElement());
		}
		
		links = links.get(0).getLinks();
		vals = new ArrayList<Integer>();
		vals.add(null);
		vals.add(null);
		vals.add(null);
		assertEquals(vals.size(), links.size());
		for (int i = 0; i < vals.size(); i++){
			if (links.get(i)==null) {
				assertEquals(vals.get(i), null);
			} else {
				assertEquals(vals.get(i), links.get(i).getElement());
			}
		}		
		
		points += 12;
	}

	public void testNothing(){
		System.out.println("Points: " + points);
	}

	public static void main(String args[]) {
		junit.swingui.TestRunner.run(Testing.class);
	}	
}

