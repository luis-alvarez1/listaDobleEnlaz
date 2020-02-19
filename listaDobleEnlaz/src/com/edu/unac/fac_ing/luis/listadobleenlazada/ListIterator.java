package com.edu.unac.fac_ing.luis.listadobleenlazada;

public class ListIterator {
    private Node current;

    public ListIterator(ListDoublyEngaged ld) {
        current = ld.top;
    }

    public Node nextNode() {
        Node a;
        a = current;
        if (current != null) {
            current = current.next;
        }
        return a;
    }

    public Node lastNode() {
        Node a;
        a = current;
        if (current != null) {
            current = current.last;
        }
        return a;
    }
}
