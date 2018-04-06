package ru.stqa.pft.sandbox;

public class Point {
    double pointA;
    double pointB;

    public Point(double pointA, double pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }
    //показывает расстояние между этой точкой и точкой которую передаем в метод
    public  double distance( Point p){
        double dx = this.pointA - this.pointB;
        double dy =  p.pointA - p.pointB;
        return Math.sqrt(dx * dx + dy * dy);

    }
}

