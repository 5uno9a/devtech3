import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author Y
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Yazod_Albusaidi
     * @see GetReturnsWrongElement
     */
    @Test
    public void testGetAtIndex() {
        if (SHOULD_FAIL) list = new GetReturnsWrongElement<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    // Tests for getFirst

    /**
     * @author Y
     * @see GetFirstReturnsWrongElement
     */
    @Test
    public void testGetFirstOnNonEmptyListReturnsFirstElement() {
        if (SHOULD_FAIL) list = new GetFirstReturnsWrongElement<>();
        fail("Not yet implemented");
    }

    // Tests for getLast

    /**
     * @author Yazeed_Albusaidi
     * @see GetLastReturnsWrongElement
     */
    @Test
    public void testGetLastOnNonEmptyListReturnsLastElement() {
        if (SHOULD_FAIL) list = new GetLastReturnsWrongElement<>();

        list.addLast(10);
        list.addLast(20);
        assertEquals(20, list.getLast());
    }

    // Tests for isEmpty

    /**
     * @author Y
     * @see IsEmptyOnNewListReturnsFalse
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new IsEmptyOnNewListReturnsFalse<>();
        fail("Not yet implemented");
    }

    // Tests for add

    /**
     * @author Yazod_Albusaidi
     * @see AddAtIndexOutOfBoundsDoesNotThrow
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new AddAtIndexOutOfBoundsDoesNotThrow<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(4, 0));
    }

    // Tests for addFirst

    /**
     * @author Y
     * @see AddFirstDoesNotAddElement
     */
    @Test
    public void testAddFirstAddsElement() {
        if (SHOULD_FAIL) list = new AddFirstDoesNotAddElement<>();
        fail("Not yet implemented");
    }

    // Tests for addLast

    /**
     * @author Yazeed_Albusaidi
     * @see AddLastDoesNotAddElement
     */
    @Test
    public void testAddLastAddsElement() {
        if (SHOULD_FAIL) list = new AddLastDoesNotAddElement<>();

        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }

    // Tests for remove

    /**
     * @author Y
     * @see RemoveAtIndexReturnsWrongElement
     */
    @Test
    public void testRemoveAtIndex() {
        if (SHOULD_FAIL) list = new RemoveAtIndexReturnsWrongElement<>();
        fail("Not yet implemented");
    }

    // Tests for removeFirst

    /**
     * @author Yazeed_Albusaidi
     * @see RemoveFirstReturnsWrongElement
     */
    @Test
    public void testRemoveFirstReturnsFirstElement() {
        if (SHOULD_FAIL) list = new RemoveFirstReturnsWrongElement<>();

        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.removeFirst());
        assertEquals(1, list.size());
        assertEquals(20, list.get(0));
    }

    // Tests for removeLast

    /**
     * @author Y
     * @see RemoveLastReturnsWrongElement
     */
    @Test
    public void testRemoveLastReturnsLastElement() {
        if (SHOULD_FAIL) list = new RemoveLastReturnsWrongElement<>();
        fail("Not yet implemented");
    }

    // Tests for size

    /**
     * @author Yazeed_Albusaidi
     * @see SizeReturnsWrongValue
     */
    @Test
    public void testSizeReturnsCorrectCount() {
        if (SHOULD_FAIL) list = new SizeReturnsWrongValue<>();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.size());
    }

    // Tests for set

    /**
     * @author Y
     * @see SetReturnsWrongElement
     */
    @Test
    public void testSetReplacesElementAtIndex() {
        if (SHOULD_FAIL) list = new SetReturnsWrongElement<>();
        fail("Not yet implemented");
    }
}