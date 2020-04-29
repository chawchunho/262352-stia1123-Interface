package com.Goldenclass.interface1;

public class Method2 {
    public static void main(String[] args) {
        Myinterface myinterface = new Myinterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello Method2");
            }
        };
        myinterface.sayHello();
    }

}
