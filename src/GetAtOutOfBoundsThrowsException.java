/**
 * Broken implementation for testGetAtOutOfBoundsThrowsException.
 * @author Yazeed_Albusaidi
 */
public class GetAtOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        return super.get(Math.min(super.size() - 1, Math.max(0, index)));
    }
}
