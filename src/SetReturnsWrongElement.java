/**
 * Broken implementation for testSetReplacesElementAtIndex.
 * @author Yazeed_Albusaidi
 */
public class SetReturnsWrongElement<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        // Wrong: always set at index 0, ignore requested index
        return super.set(0, element);
    }
}
