package commands.view;

import parser.Constants;
import model.Model;
import commands.Command;

/**
 * Sets the pen position to be up (0) so that line drawing cannot
 * occur as the turtle moves.
 * Returns 0
 * @author carlosreyes
 *
 */
public class SetPenUp extends Command {

	@Override
	public double evaluate(Model model) {
		model.setPenVisible(Constants.PEN_NOTSHOWING);
		return 0;
	}

}