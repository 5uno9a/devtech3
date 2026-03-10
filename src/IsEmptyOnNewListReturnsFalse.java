/**
 * Broken implementation for testIsEmptyWhenCreated.
 * @author Yazeed_Albusaidi
 */
public class IsEmptyOnNewListReturnsFalse<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        // Wrong: always return false
        return false;
    }
}
