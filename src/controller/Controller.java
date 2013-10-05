package controller;
import view.View;
import java.util.List;

import model.Line;
import model.Model;
import model.State;

/**
 * Command string in happens here, sends this string
 * to the model to be sent to be processed.
 * Controller also receives processed info and then updates
 * the view based on this info.
 * @author carlosreyes kevinjian
 */
public class Controller {
	private Model myModel;
	private View myView;
	
	/**
	 * constructor for controller
	 * @param view - view object
	 * @param model - model object
	 */
	public Controller(View view, Model model){
		myView = view;
		myModel=model;
	}
	
	/**
	 * creates display and command window, sets origin in model
	 */
	public void initiate(){
		myModel.initiate();
	}
	
	/**
	 * gets user input types into command window
	 * @return String of user input
	 */
	public String viewString() {
		return myView.getInputString();
	}
	
	/**
	 * passes user input to model to process
	 * @param input - String of user input 
	 */
	public void processString(){
		myModel.processString(viewString());
		//myModel.getOutput();
		//myView.setOutput();
	}
	
	/**
	 * gets current State of turtle
	 * @return State of turtle
	 */
	public State modelCurrentState() {
		return myModel.getCurrentState();
	}
	
	/**
	 * gets trail
	 * @return List of Lines that create trail
	 */
	public List<Line> getTrail() {
		return myModel.getTrail();
	}
	
}