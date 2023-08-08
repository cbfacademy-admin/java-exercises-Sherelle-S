package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String[] args) {

        Paint paint = new Paint(200);
        Rectangle rectangle = new Rectangle("Rectangle", 35, 20);
        paint.amount(rectangle);

        Sphere sphere = new Sphere("Sphere", 10);
        paint.amount(sphere);

        Cylinder cylinder = new Cylinder("Cylinder", 10, 5);
        paint.amount(cylinder);
    }

}
