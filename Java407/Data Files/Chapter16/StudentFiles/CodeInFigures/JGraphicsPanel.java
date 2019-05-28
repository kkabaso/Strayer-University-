import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JGraphicsPanel extends JPanel
{
   public JGraphicsPanel(Color color)
   {
      setBackground(color);
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.YELLOW);
      g.fillOval(10, 5, 40, 40);
      g.fillOval(60, 5, 40, 40);
   }
}
