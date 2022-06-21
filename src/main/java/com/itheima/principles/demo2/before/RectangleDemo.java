package com.itheima.principles.demo2.before;

import java.util.concurrent.SynchronousQueue;

public class RectangleDemo {

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);

        resize(r);
        printLengthAndWidth(r);

        System.out.println("====================");

        Square s = new Square();
        s.setLength(10);
        resize(s);
        printLengthAndWidth(s);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

}
