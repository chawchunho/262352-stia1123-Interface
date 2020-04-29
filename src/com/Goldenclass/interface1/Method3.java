package com.Goldenclass.interface1;

public class Method3 {
    public static void main(String[] args) {
        Myinterface myinterface = () -> System.out.println("Hello Method3");
        myinterface.sayHello();
    }
}
