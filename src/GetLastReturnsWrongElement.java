/**
 * Broken implementation for testGetLastOnNonEmptyListReturnsLastElement.
 * @author Y
 * TODO: Y implements broken behavior so this test fails when SHOULD_FAIL is true.
 */
public class GetLastReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        return super.getLast(); // TODO: replace with broken behavior
    }
}
