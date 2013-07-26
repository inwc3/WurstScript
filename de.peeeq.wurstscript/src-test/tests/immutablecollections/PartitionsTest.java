package tests.immutablecollections;

import static org.junit.Assert.*;

import org.junit.Test;

import de.peeeq.datastructures.Partitions;

public class PartitionsTest {

	@Test
	public void simpleUnion() {
		Partitions<String> p = new Partitions<>();
		p.add("a");
		p.add("b");
		p.add("c");
		p.add("d");
		
		p.union("c", "a");
		p.union("c", "b");
		
		p.union("d", "a");
		p.union("d", "b");
		
		assertEquals(p.getRep("a"), p.getRep("b"));
		assertEquals(p.getRep("a"), p.getRep("c"));
		assertEquals(p.getRep("a"), p.getRep("d"));
		
	}

}