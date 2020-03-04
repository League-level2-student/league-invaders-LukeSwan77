import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	static JFrame frame;
	public static final int gameWidth = 500;
	public static final int gameHeight = 800;
	public LeagueInvaders() {
		frame = new JFrame("League Invaders");
	}
	
public static void main(String[] args) {
	LeagueInvaders invader = new LeagueInvaders();
	invader.setup();
	
}

void setup() {
	frame.setSize(gameWidth, gameHeight);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
