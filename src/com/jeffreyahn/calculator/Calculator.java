package com.jeffreyahn.calculator;

@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable {
	private double operandOne;
	private String Operation;
	private double operandTwo;
	private double results;
	
	public Calculator() {
	}
	public void performOperation() {
		double results=0;
		switch(this.getOperation()) {
		case "+":
			results = this.getOperandOne() + this.getOperandTwo();
			break;
		case "-":
			results = this.getOperandOne() - this.getOperandTwo();
			break;
		case "*":
			results = this.getOperandOne() * this.getOperandTwo();
			break;
		case "/":
			results = this.getOperandOne() / this.getOperandTwo();
			break;
		default:
			System.out.println("stop");
			break;
		}
		this.setResults(results);
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
}
