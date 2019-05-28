import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoOval extends JFrame 
{
   public void paint(Graphics tool)
   {
      super.paint(tool);
      tool.drawRect(50, 50, 100, 60);
      tool.drawOval(50, 50, 100, 60);
   }
   public static void main(String[] args)
   {
      JDemoOval frame = new JDemoOval();
      frame.setSize(200, 150);
      frame.setVisible(true);
   }
}
