package com.kpsh;

public class Main {

    public static void main(String[] args) {
        A objA = new B();
        B objB = new B();
        System.out.println("Вывод значения х из объекта А: " + objA.x);
        System.out.println("Вывод значения х из объекта В: " + objB.x);
    }
}
