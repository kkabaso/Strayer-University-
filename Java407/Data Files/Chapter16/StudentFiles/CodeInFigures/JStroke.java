import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class JStroke extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      BasicStroke aStroke = new BasicStroke(15.0f,
         BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
      gr2D.setStroke(aStroke);
      gr2D.draw(new Rectangle2D.Double(40, 40, 100, 100));
   }
   public static void main(String[] args)
   {
      JStroke frame = new JStroke();
      frame.setSize(180, 180);
      frame.setVisible(true);
   }
}
