// Definisi package
package com.geometry.flatshape;

// Interface untuk Bangun Datar
public interface Shape {
    double getArea();
    double getPerimeter();
}

// Kelas Persegi Panjang
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Kelas Persegi
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

// Kelas Lingkaran
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Kelas Abstract Segitiga
public abstract class Triangle implements Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}

// Subkelas Segitiga
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return 3 * sideA;
    }
}

// Definisi package lain
package com.geometry.solidshape;

// Interface untuk Bangun Ruang
public interface Geometry {
    double getVolume();
    double getSurfaceArea();
}

// Kelas Kubus
public class Cube extends Square implements Geometry {
    public Cube(double side) {
        super(side);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSide(), 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * getArea();
    }
}

// Kelas Balok
public class Cuboid extends Rectangle implements Geometry {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }
}

// Kelas Bola
public class Sphere implements Geometry {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

// Kelas Tabung
public class Cylinder extends Circle implements Geometry {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
