import java.awt.*;
import javax.swing.*;

public class Main extends Canvas{
	public void paint(Graphics g){
		setBackground(Color.WHITE);
		setForeground(Color.RED);
		g.drawString("Hello World", 50, 100);
		g.fillRect(130, 30,100, 80); 
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("Sufnituning");
		f.setSize(600, 400);
		Main g = new Main();
		f.add(g);
		f.setVisible(true);
	}

}
