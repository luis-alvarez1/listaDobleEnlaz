package com.edu.unac.fac_ing.luis.listadobleenlazada;

public class ListDoublyEngaged {
    protected Node top;
    protected int num_items;

    public ListDoublyEngaged() {
    }

    public ListDoublyEngaged insertTop(int input) {
        Node newNode;
        newNode = new Node(input);
        newNode.next = top;
        if (top != null)
            top.last = newNode;
        top = newNode;
        num_items++;
        return this;
    }

    public void getList() {
        ListIterator iterator = new ListIterator(this);
        Node a;
        a = iterator.nextNode();
        while (a != null) {
            int w = a.getValue();
            System.out.println(w);
            a = iterator.nextNode();
        }
    }

    public ListDoublyEngaged insertMedium(Node last, int input) {
        Node nuevo;
        nuevo = new Node(input);
        nuevo.next = last.next;
        if (last.next != null) {
            last.next.last = nuevo;
        }
        last.next = nuevo;
        nuevo.last = last;
        num_items++;
        return this;
    }

    public void delete(int input) {
        Node current;
        boolean found = false;
        current = top;
        // Bucle de b�squeda
        while ((current != null) && (!found)) {
            /*
             * la comparacion se realiza con el metodo equals()..., depende del tipo
             * Elemento
             */
            found = (current.value == input);
            if (!found) {
                current = current.next;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (current != null) {
            // distingue entre nodo cabecera o resto de la lista
            if (current == top) {
                top = current.next;
                if (current.next != null) {
                    current.next.last = null;
                } else if (current.next != null) {
                    // No es el �ltimo nodo
                    current.last.next = current.next;
                    current.next.last = current.last;
                } else // �ltimo nodo
                    current.last.next = null;
                current = null;
                num_items--;
            }
        }
    }

    public int getNumeroRegistros() {
        return num_items;
    }
}
