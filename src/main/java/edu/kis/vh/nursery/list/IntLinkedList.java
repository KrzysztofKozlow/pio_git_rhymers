package edu.kis.vh.nursery.list;

/**
 * LinkedList dla wartości typu int
 */
public class IntLinkedList {

    /**
     * Ostatni Node listy
     */
    Node last;

    /**
     * Zmienna typu int - nie używana
     */
    private int i;

    /**
     * Dodaje Node do końca listy
     * @param i Wartość przechowywana w dodanyme Node
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Informuje czy lista jest pusta
     * @return true jeżeli lista jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Zwraca informacje czy lista jest pełna
     * @return zawsze zwraca false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z ostatniego Node listy
     * @return wartość int w ostatnim Node lub -1 jeżeli pusta lista
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * Zwraca wartość z ostatniego Node i usuwa go z listy
     * @return wartość int w ostatnim Node lub -1 jeżeli pusta lista
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
