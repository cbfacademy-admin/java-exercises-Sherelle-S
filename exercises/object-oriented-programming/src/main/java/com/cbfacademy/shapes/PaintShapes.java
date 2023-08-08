package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String[] args) {

        Paint paint = new Paint(200);
        Rectangle rectangle = new Rectangle("Rectangle", 35, 20);
        System.out.println("The area of the rectangle is "+rectangle.area());
        paint.amount(rectangle);

        Sphere sphere = new Sphere("Sphere", 10);
        System.out.println("The area of the sphere is "+sphere.area());
        paint.amount(sphere);

        Cylinder cylinder = new Cylinder("Cylinder", 10, 5);
        System.out.println("The area of the cylinder is "+cylinder.area());
        paint.amount(cylinder);
    }

}
