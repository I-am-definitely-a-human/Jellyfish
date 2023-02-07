package model;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
public class Calculator {
	
	private double first;
	private double second;
	private double result;
	
	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	/**
	 * Adds two numbers together. Stores its arguments in the "first" and "second" variables and stores the result in the "result" variable.
	 * @param a - first number
	 * @param b - second number
	 */
	public void add(double a, double b) {
		this.first = a;
		this.second = b;
		this.result = a + b;
	}
	
	/**
	 * Subtracts. Stores its arguments in the "first" and "second" variables and stores the result in the "result" variable.
	 * @param a - first number
	 * @param b - second number
	 */
	public void subtract(double a, double b) {
		this.first = a;
		this.second = b;
		this.result = a - b;
	}
	
	/**
	 * Multiplies two numbers. Stores its arguments in the "first" and "second" variables and stores the result in the "result" variable.
	 * @param a - first number
	 * @param b - second number
	 */
	public void multiply(double a, double b) {
		this.first = a;
		this.second = b;
		this.result = a * b;
	}
	
	/**
	 * Divides two numbers. Stores its arguments in the "first" and "second" variables and stores the result in the "result" variable.
	 * @param a - first number
	 * @param b - second number
	 */
	public void divide(double a, double b) {
		this.first = a;
		this.second = b;
		this.result = a / b;
	}
	
	/**
	 * Default constructor
	 */
	public Calculator() {}
	
}
