package model;


/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
public class NaN {
	
	private String result;

	public String getResult() {
		return result;
	}
	public void setResult(String message) {
		this.result = message;
	}
	
	/**
	 * Default constructor
	 */
	public NaN() {
		this.result = "Not a number";
	}
	
	/**
	 * Constructor
	 * @param message - the message
	 */
	public NaN(String message) {
		this.result = message;
	}
	
}
