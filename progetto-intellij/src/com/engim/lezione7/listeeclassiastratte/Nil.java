package com.engim.lezione7.listeeclassiastratte;

public class Nil extends List{

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

}
