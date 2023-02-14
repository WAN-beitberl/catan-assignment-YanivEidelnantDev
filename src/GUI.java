import java.awt.Graphics;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;


public class GUI extends JPanel {
    public GUI()
    {
        setPreferredSize(new Dimension(1200, 800));
    }
    public void DrawGUI(Graphics g)
    {
        // Drawing Player Info
        g.setColor(Color.CYAN);
        g.fillRect(0,0, 250, 400);
        g.setColor(Color.BLACK);
        g.drawRect(-2,-2, 250, 400);
        g.setColor(Color.CYAN);
        g.fillRect(0,400, 250, 400);
        g.setColor(Color.BLACK);
        g.drawRect(-2,398, 250, 400);
        g.setColor(Color.CYAN);
        g.fillRect(950,0, 250, 400);
        g.setColor(Color.BLACK);
        g.drawRect(948,-2, 250, 400);
        g.setColor(Color.CYAN);
        g.fillRect(950,400, 250, 400);
        g.setColor(Color.BLACK);
        g.drawRect(948,398, 250, 400);
        g.setColor(Color.CYAN);

        // Drawing Button Area
        g.fillRect(250,600, 700, 200);
        g.setColor(Color.BLACK);
        g.drawRect(248,598, 700, 200);
    }
}
