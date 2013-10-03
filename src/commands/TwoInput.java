package commands;

import model.Model;

public abstract class TwoInput implements Command{

	/**
	 * Carries out an operation.
	 * @param model
	 * @return
	 */
	private double inputValueOne;
	private double inputValueTwo;
		
	public double getInputValueOne() {
		return inputValueOne;
	}
	
	public void setInputValueOne(double inputValueOne) {
		this.inputValueOne = inputValueOne;
	}
	
	public double getInputValueTwo() {
		return inputValueTwo;
	}
	
	public void setInputValueTwo(double inputValueTwo) {
		this.inputValueTwo = inputValueTwo;
	}
	
	public abstract double operation (Model model);

}
