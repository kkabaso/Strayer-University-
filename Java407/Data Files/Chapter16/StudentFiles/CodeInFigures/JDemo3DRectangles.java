import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemo3DRectangles extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      final int WIDTH = 60, HEIGHT = 80;
      gr.setColor(Color.PINK);
      gr.fill3DRect(20, 40, WIDTH, HEIGHT, true);
      gr.fill3DRect(100, 40, WIDTH, HEIGHT, false);
   }
   public static void main(String[] args)
   {
      JDemo3DRectangles frame = new JDemo3DRectangles();
      frame.setSize(180, 150);
      frame.setVisible(true);
   }
}
