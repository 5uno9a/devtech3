/**
 * Broken implementation for testGetAtIndex.
 * @author Y
 * TODO: Y implements broken behavior so this test fails when SHOULD_FAIL is true.
 */
public class GetReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        return super.get(index); // TODO: replace with broken behavior
    }
}

