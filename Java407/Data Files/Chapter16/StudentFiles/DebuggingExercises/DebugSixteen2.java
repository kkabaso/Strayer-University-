// Frame lets you position circle with mouse
// frame changes color when mouse enters and exits

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class DebugSixteen2 extends JFrame implements MouseListener
{
   int x, y;
   int size;
   Container con = getContentPane();

   public DebugSixteen2()
   {
      setTitle("Debug Exercise");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      addMouseListener;
   }
   public static void main(String[] args)
   {
     DebugSixteen2 deFrame = new DebugSixteen2();
   }

   public void mousePressed(MouseEvent e)
   {
      x = e.getX();
      y = e.getY();
   }

   public void mouseClick(MouseEvent e)
   {
     if(e.getClickCount() == 2)
       size = 10;
     else
       size = 20;
    painter();
  }
  public void mouseEntered(MouseEvent e)
  {
    con.setBackground(ORANGE);
  }
  public void mouseExited(MouseEvent e)
  {
    con.setBackground(Color.RED);
  }

  public void mouseReleased(MouseEvent e)
  {
  }
  public void paint(Graphics g)
  {
     super.paint(g);
     g.drawOval(x - size, y - size, size * 2, size * 2);
  }
}