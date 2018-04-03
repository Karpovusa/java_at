package ru.stqa.pft.sandbox;

import java.net.SocketTimeoutException;

class MyFirstProgram{
	public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Alexei");

		double l = 5;
		System.out.println("площадь квадрата со стороной " + l + "равна " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("площадь прямоугольника со сторонами " + a + " и " + b +" равна " + area(a,b));
	}
	public	static void hello(String somebody ) {

		System.out.println("Hello " + somebody + " !");
	}

	public static double area(double len){
		return len*len;
	}

	public static double area(double a, double b){
		return a*b;
	}
}