package com.itheima.principles.demo2.after;

import org.w3c.dom.css.Rect;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(20);

        resize(r);

        printLengthAndWidth(r);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}
