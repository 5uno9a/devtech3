/**
 * Broken implementation for testRemoveLastReturnsLastElement.
 * @author Yazeed_Albusaidi
 */
public class RemoveLastReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E removeLast() {
        // Wrong: remove and return first element instead of last
        return super.removeFirst();
    }
}
