package com.engim.lezione7;

public class Node extends List {
    private List next;
    private int value;

    public Node(List next, int value) {
        this.next = next;
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
