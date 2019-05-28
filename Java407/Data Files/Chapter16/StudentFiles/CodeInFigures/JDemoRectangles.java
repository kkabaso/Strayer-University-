import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemoRectangles extends JFrame
{
   Container con = getContentPane();
   public JDemoRectangles()
   {
      con.setBackground(Color.BLUE);
      con.setLayout(new FlowLayout());
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      gr.setColor(Color.RED);
      gr.fillRect(40, 40, 120, 120);
      gr.setColor(Color.YELLOW);
      gr.fillRect(80, 80, 160, 160);
      gr.clearRect(50, 60, 50, 50);
   }
   public static void main(String[] args)
   {
      JDemoRectangles frame = new JDemoRectangles();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}
