package com.company;

import static java.lang.Math.sqrt;

public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean isEqual(Point3d point1) {
        if ((point1.getX() == this.getX()) && (point1.getY() == this.getY()) && (point1.getZ() == this.getZ()))
            return true;
        else return false;
    }

    public static double distanceTo(Point3d point1, Point3d point2){
        double x1 = point1.getX(), y1 = point1.getY(), z1 = point1.getZ();
        double x2 = point2.getX(), y2 = point2.getY(), z2 = point2.getZ();
        return sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (z2-z1)*(z2-z1));
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double a = distanceTo(point1, point2);
        double b = distanceTo(point2, point3);
        double c = distanceTo(point1, point3);
        double p = (a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
    }
