import javax.swing.*;
import java.awt.*;
public class JDemoFillArc extends JFrame 
{
   public void paint(Graphics g)
   {
      super.paint(g);
      g.fillArc(20, 50, 100, 100, 20, 320);
      g.fillArc(60, 50, 100, 100, 340, 40);

   }
   public static void main(String[] args)
   {
      JDemoFillArc frame = new JDemoFillArc();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}
