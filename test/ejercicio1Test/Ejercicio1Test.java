package ejercicio1Test;

import org.junit.runner.RunWith;
import ejercicio1.SinglyLinkedList;
import static org.junit.Assume.*;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(Theories.class)
public class Ejercicio1Test {
	
	private static final int MIN_INT = 1; // Minimum possible value of the list's elements
	private static final int MAX_INT = 5; // Maximum possible value of the list's elements
	private static final int MIN_SIZE= 0; // Minimum size of the list
	private static final int MAX_SIZE= 2; // Maximum size of the list
	private static final int LISTS_AMOUNT= 3; // Amount of generated lists
		
	@Theory
	public void removeDecreaseSize(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		System.out.println("listas 1");
		System.out.println(l.toString());
		l.addFirst(4);
		l.addFirst(7);
		int size = l.getSize();
		l.remove(4); 
		assertThat(l.getSize(), equalTo(size-1));
	}
	
	@Theory
	public void removeDecreaseSize2(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		//l.addFirst(3);
		assumeTrue(!l.isEmpty());
		//System.out.println(l.toString());
		int size = l.getSize();
		l.remove(l.getHeader().getNext().getValue()); 
		assertThat(l.getSize(), equalTo(size-1));
	}
	
	@Theory
	public void addIncreaseSize(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		//assumeTrue(true);
		//System.out.println(l.toString());
		int size = l.getSize();
		l.addFirst(6);
		assertThat(l.getSize(), equalTo(size+1));
	}
	
	@Theory
	public void containsAddedElement(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		System.out.println(l.toString());
		l.addFirst(5); 
		assertThat(l.contains(5), equalTo(true));
	}
	
	@Theory
	public void notContainsRemovedElement(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		assumeTrue(!l.contains(MAX_INT + 1));
		l.addFirst(MAX_INT + 1); 
		l.remove(MAX_INT + 1);
		assertThat(l.contains(MAX_INT + 1), equalTo(false));
	}
	
	@Theory
	public void duplicated(@ListGen(minInt = MIN_INT, maxInt = MAX_INT, minSize = MIN_SIZE, maxSize = MAX_SIZE, amountLists = LISTS_AMOUNT) SinglyLinkedList l) {
		SinglyLinkedList list = new SinglyLinkedList(l);
		assertThat(l.toString(), equalTo(list.toString()));
	}
}
