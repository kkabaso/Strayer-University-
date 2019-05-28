import javax.swing.*;
import java.awt.*;
public class JStar extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      int xPoints[] = {42, 52, 72, 52,  60, 40, 15,  28, 9,  32, 42};
      int yPoints[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
      gr.drawPolygon(xPoints, yPoints, xPoints.length);
   }
   public static void main(String[] args)
   {
      JStar frame = new JStar();
      frame.setSize(80, 150);
      frame.setVisible(true);
   }
}
