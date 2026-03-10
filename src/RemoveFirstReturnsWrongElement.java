/**
 * Broken implementation for testRemoveFirstReturnsFirstElement.
 * @author Y
 * TODO: Y implements broken behavior so this test fails when SHOULD_FAIL is true.
 */
public class RemoveFirstReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E removeFirst() {
        return super.removeFirst(); // TODO: replace with broken behavior
    }
}
