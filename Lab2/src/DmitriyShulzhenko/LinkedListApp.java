package DmitriyShulzhenko;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListApp {
	@Test
	public void testAddOneItem() throws IndexOutOfListSizeException {
		MyList list = new MyList();
		list.add(3);
		assertEquals(3, list.get(0));
	}

	@Test
	public void testAddSecondItem() throws IndexOutOfListSizeException {
		MyList list = new MyList();
		list.add(3);
		list.add(5);
		assertEquals(5, list.get(1));
	}

	@Test
	public void testFirstItemRemainsAfterAddingSecond() throws IndexOutOfListSizeException {
		MyList list = new MyList();
		list.add(3);
		list.add(5);
		assertEquals(3, list.get(0));
	}
}