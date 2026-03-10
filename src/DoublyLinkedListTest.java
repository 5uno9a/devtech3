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
     * @author grayson_replace_this
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

        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.getFirst());
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

        assertTrue(list.isEmpty());
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
     * @see
     */
    @Test
    public void testAddFirstAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for addLast

    /**
     * @author
     * @see
     */
    @Test
    public void testAddLastAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for remove

    /**
     * @author
     * @see
     */
    @Test
    public void testRemoveAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for removeFirst

    // Tests for removeLast

    // Tests for size

    // Tests for set

}