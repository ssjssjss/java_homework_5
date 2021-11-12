package ssj_5;

import java.util.Scanner;

public class QuadraticEquation_9_10 {
	private double a,b,c;
	QuadraticEquation_9_10(double newa,double newb,double newc){
		a=newa;
		b=newb;
		c=newc;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		if(b*b-4*a*c>=0)
			return (-b+Math.sqrt(b*b-4*a*c))/2/a;
		return 0;
	}
	public double getRoot2() {
		if(b*b-4*a*c>=0)
			return (-b-Math.sqrt(b*b-4*a*c))/2/a;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter a, b, c: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation_9_10 myQuadraticEquation =new QuadraticEquation_9_10(a,b,c);
		if(myQuadraticEquation.getDiscriminant()>0)
			System.out.printf("The equation has two roots %f and %f",myQuadraticEquation.getRoot1(),myQuadraticEquation.getRoot2());
		else if(myQuadraticEquation.getDiscriminant()==0)
			System.out.printf("The equation has one root %f",myQuadraticEquation.getRoot1());
		else
			System.out.printf("The equation has no real root");
	}

}
