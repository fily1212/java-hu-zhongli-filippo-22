package com.engim.lezione8.interfacce.esempio;

public class Main {
    public static void main(String[] args) {
        I1 a = new A();
        a.m1();
        ((A)a).m2();
        //I1 b = new I1(); NO
    }

}
