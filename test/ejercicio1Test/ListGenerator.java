 package ejercicio1Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import ejercicio1.SinglyLinkedList;

public class ListGenerator extends ParameterSupplier {

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		ListGen annotation = sig.getAnnotation(ListGen.class);
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		for (int i = 0; i < annotation.amountLists(); i++) {
			values.add(PotentialAssignment.forValue("list "+i, generateSinglyLinkedList(sig)));
		}
		return values;
	}
	
	private SinglyLinkedList generateSinglyLinkedList(ParameterSignature sig) {
		ListGen annotation = sig.getAnnotation(ListGen.class);
		Random n = new Random();
		int listLength = n.nextInt(annotation.maxSize() - annotation.minSize() + 1) + annotation.minSize();
		SinglyLinkedList newList = new SinglyLinkedList();
		for (int i = 0; i < listLength; i++) {
			newList.addFirst(n.nextInt(annotation.maxInt() - annotation.minInt() + 1) + annotation.minInt());
		}
		return newList;
	}
}
