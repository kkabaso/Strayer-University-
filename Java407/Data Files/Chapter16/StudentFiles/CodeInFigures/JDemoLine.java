import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoLine extends JFrame 
{
   public void paint(Graphics pen)
   {
      super.paint(pen);
      pen.drawLine(50, 50, 100, 200);
   }
   public static void main(String[] args)
   {
      JDemoLine frame = new JDemoLine();
      frame.setSize(150, 250);
      frame.setVisible(true);
   }
}
