// This program should display a bullseye, not a cone
import javax.swing.*;
import java.awt.*;
import java.awt.Colorl

public class DebugSixteen1 extends JFrame
{
   String msg = This is a bull's eye";
   public DebugSixteen1
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      int radius,corner;
      for(corner = 150, radius = 2; radius < 200; radius += 6)
      {
         if(radius < 50)
            gr.setColor(Color.RED);
         else if(radius < 100)
            gr.setColor(Color.GREEN);
         else if (radius < 150)
            gr.setColor(Color.YELLOW);
         else
            gr.setColor(Color.BLUE);
         gr.drawOval(corner, corner, radius, radius);

      }
      gr.setFont(new Font("Arial", Font.ITALIC, 20));
      gr.setColor(Color.BLACK);
      gr.drawString(msg, 100, 150)
   }
   public static void main(String[] args)
   {
      DebugSixteen1 frame;
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}