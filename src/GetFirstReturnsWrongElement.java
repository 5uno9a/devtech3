/**
 * Broken implementation for testGetFirstOnNonEmptyListReturnsFirstElement.
 * @author Yazeed_Albusaidi
 */
public class GetFirstReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        // Wrong: return last element instead of first
        if (super.isEmpty()) throw new java.util.NoSuchElementException();
        return super.getLast();
    }
}
