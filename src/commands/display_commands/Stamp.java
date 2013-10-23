package commands.display_commands;

import model.Model;
import commands.CommandZeroInput;

public class Stamp extends CommandZeroInput {
	
	@Override
	public double evaluate(Model model) {
		model.addStamp(model.getCurrentState());
		return 0;
	}	
}
