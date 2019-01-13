package com.day02;

public class Calc {

	int a=10, b=20, c;
	String sname = "vijay";
	static int rno = 1511567;
	
	public void sum()

	{
		c=a+b;
		System.out.println("stud name is:" +sname);
		System.out.println("Sum is: " +c);
		
	}
	
	public void sub()

	{
		c=b-a;
		System.out.println("Sub is: " +c);
		
	}
	
	public void mul()

	{
		c=a*b;
		System.out.println("mul is: " +c);
		
	}
	
	public void div()

	{
		int a=40, b=5;
		
		c=a/b;
		System.out.println("div is: " +c);
		
	}
	
	public static void main(String[] args) {
	
		int a=10, b=20, c;
		c=a+b;
		
		System.out.println("Roll no is:" +rno);		
		System.out.println("sum is:" +c);
		
		Calc obj = new Calc();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();

	}

}
