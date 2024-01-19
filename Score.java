
import java.awt.*;

public class Score extends Rectangle{

	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	
	Score(int GAME_WIDTH, int GAME_HEIGHT){
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g;
			g.setColor(Color.white);
			g.setFont(new Font("Consolas",Font.PLAIN,60));
			
	        Stroke dashed = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{25}, 30);
	        g2d.setStroke(dashed);
	        g2d.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
			
			g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
			g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
		
		if (player1 == 5) {
		    g.setColor(Color.WHITE);
		    g.setFont(new Font("Courier New", 0, 60));
		    g.drawString("Winner", (GAME_WIDTH / 2) - 325, 50);
		} else if (player2 == 5) {
		    g.setColor(Color.WHITE);
		    g.setFont(new Font("Courier New", 0, 60));
		    g.drawString("Winner", (GAME_WIDTH / 2) + 110, 50);
		}
	}
	
}