/**
 * @author Yazod_Albusaidi
 */
public class GetReturnsWrongElement<E> extends DoublyLinkedList<E> {

    @Override
    public E get(int index) {
        // Incorrectly ignores the requested index and always returns the first element
        return super.get(0);
    }
}

