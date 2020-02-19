package com.edu.unac.fac_ing.luis.listadobleenlazada;

public class Node {
    protected int value;
    protected Node next;
    protected Node last;

    public Node(int name) {
        value = name;
        next = last = null;
    }

    public int getValue() {
        return value;
    }
}


	