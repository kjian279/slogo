package slogoGame;

import java.util.ArrayList;

import jgame.*;
import jgame.platform.JGEngine;

public class Grid extends JGObject{
	private JGEngine myEngine;
	ArrayList<Line> l;
	public Grid(String name, int collisionid, JGEngine tgame) {
		super(name, true, tgame.getWidth(), tgame.getHeight(), collisionid, null);
		myEngine = tgame;
		l = new ArrayList<Line>();
	}
	public void paint()
	{
		int num = 10;
		int xNum = myEngine.getWidth()/num;
		int yNum = myEngine.getHeight()/num;
		for (int i = 0; i <= num; i++) //horizontal lines
		{
			l.add(new Line("line", 10, myEngine, 0, yNum*i, myEngine.getWidth(), yNum*i));
		}
		for (int i = 0; i <= num; i++) //vertical lines
		{
			l.add(new Line("line", 10, myEngine, xNum*i, 0, xNum*i, myEngine.getHeight()));
		}
	}
}
