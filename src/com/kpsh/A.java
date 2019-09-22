package com.kpsh;

public class A {
    int x = 1, y = 2;
    public A() {
        y = getX();
        System.out.println("в классе A после вызова" + " getX() x=" + x + " y=" + y);
    }
    public int getX(){
        System.out.println("в классе A");
        return x;
    }
}

