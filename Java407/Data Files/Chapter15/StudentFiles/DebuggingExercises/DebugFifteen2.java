// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFifteen2 extends JFrame
{
  JButton nb = new JButton("Left  ");
  JButton sb = new JButton("Center");
  JButton eb = new JButton("Up    ");
  JButton wb = new JButton("Down  ");
  JButton cb = new JButton("Right ");
  Container con = null;

  public DebugFifteen2()
  {
     con = this.getContentPane();
     con.setLayout(new Borderlayout());
     con.add(nb);
     con.add(sb);
     con.add(eb);
     con.add(wb);
     con.add(cb);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
 }