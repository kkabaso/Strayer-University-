import javax.swing.*;
import java.awt.*;
public class JDemoRoundRectangles extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      int x = 20;
      int y = 40;
      final int WIDTH = 80, HEIGHT = 80;
      final int HORIZONTAL_GAP = 100;
      for(int arcSize = x; arcSize <= HEIGHT; arcSize += 20)
      {
         gr.drawRoundRect(x, y, WIDTH, HEIGHT, arcSize, arcSize);
         x += HORIZONTAL_GAP;
      }
   }
   public static void main(String[] args)
   {
      JDemoRoundRectangles frame = new JDemoRoundRectangles();
      frame.setSize(420, 140);
      frame.setVisible(true);
   }
}
