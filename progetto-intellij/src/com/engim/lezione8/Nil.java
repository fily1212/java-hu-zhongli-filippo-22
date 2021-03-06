package com.engim.lezione8;

public class Nil extends List {

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public List add(int index, int value) {
        if (index == 0){
            return new Node(this, value);
        }
        else {
            System.out.println("index out of bound Exception");
            System.exit(1);
            return null;
        }
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public List removeIndex(int i) {
        System.out.println("Index out of bound exception");
        System.exit(1);
        return this;
    }
}
