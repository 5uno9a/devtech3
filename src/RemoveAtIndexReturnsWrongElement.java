/**
 * Broken implementation for testRemoveAtIndex.
 * @author Yazeed_Albusaidi
 */
public class RemoveAtIndexReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        // Wrong: always remove and return first element
        return super.remove(0);
    }
}
