package ssj_5;

import java.util.Scanner;

public class LinearEquation_9_11 {
	private double a,b,c,d,e,f;
	LinearEquation_9_11(double newa,double newb,double newc,double newd,double newe,double newf){
		a=newa;
		b=newb;
		c=newc;
		d=newd;
		e=newe;
		f=newf;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0) return true;
		return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter a, b, c, d, e, f: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation_9_11 myLinearEquation =new LinearEquation_9_11(a,b,c,d,e,f);
		if(myLinearEquation.isSolvable()==false)
			System.out.printf("The equation has no solution.");
		else
			System.out.printf("x is %.2f and y is %.2f",myLinearEquation.getX(),myLinearEquation.getY());
	}

}
