/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.LinkedList;

public class GenericQueue<E> {
    //Generic link list
    private LinkedList<E> list = new LinkedList<E>();

    //Adds the item venerable to list.
    public void enqueue(E item) {
        list.addFirst(item);
    }

    //Returns list with the first item removed.
    public E dequeue() {
        return list.removeFirst();
    }

    //Returns the size of list.
    public int size() {
        return list.size();
    }
}
