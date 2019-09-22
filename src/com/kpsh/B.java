package com.kpsh;

public class B extends A{
    int x = 3, y = 4;
    public B() {
        System.out.println("в классе B x=" + x + " y=" + y);
    }
    public int getX(){
        System.out.println("в классе B");
        return x;
    }
}

