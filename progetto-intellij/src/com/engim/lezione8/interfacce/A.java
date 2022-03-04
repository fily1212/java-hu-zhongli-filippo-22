package com.engim.lezione8.interfacce;

public class A implements I1{
    @Override
    public void m1(int x) {
        System.out.println(x);
    }

    @Override
    public int m2() {
        return 0;
    }
    public int m3(){
        return 5;
    }
}
