/**
 * Broken implementation for testAddAtIndexOutOfBoundsThrowsException.
 * @author Y
 * TODO: Y implements broken behavior so this test fails when SHOULD_FAIL is true.
 */
public class AddAtIndexOutOfBoundsDoesNotThrow<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
        super.add(index, element); // TODO: replace with broken behavior
    }
}
