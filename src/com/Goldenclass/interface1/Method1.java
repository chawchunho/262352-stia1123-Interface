package com.Goldenclass.interface1;

public class Method1 implements Myinterface {

    @Override
    public void sayHello() {
        System.out.println("Hello Method");
    }

    public static void main(String[] args) {
        Method1 method1= new Method1();
        method1.sayHello();
    }



}
