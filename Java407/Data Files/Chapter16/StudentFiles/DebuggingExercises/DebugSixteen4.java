// This program shows a customer
// what a shirt looks like in different colors

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class DebugSixteen4 extends JFrame implements ActionListener
{
   JLabel header = new JLabel("Outfit planner");
   JButton changeButton = new JButton("Change clothes");
   FlowLayout flow = new FlowLayout();
   int counter;
   int xTop[] = {20,40,50,60,80,75,62,66,40,38,25,20};
   int yTop[] = {142,130,138,130,138,148,142,160,160,142,148,142};
   Color[] colors = {Color.RED, Color.PINK, Color.YELLOW, Color.GREEN, Color.CYAN};
   double price = 39.95;

   public DebugSixteen4()
   {
      Container con = getContentPane();
	con.setLayout(flowlayout);
      setBackground(ColorWHITE);
      con.add(header);
      con.add(changeButton)
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void actionPerformed(ActionEvent e)
   {
      Graphics gr = new Graphics();
      final int X = 100;
      int y = 100;
      final GAP = 20;
      int cycle = counter % 5;

      gr.setColor(colors[cycle]);

      gr.fillPolygon(xTop, yTop, 12);
      gr.setColor(Color.BLACK);
      gr.drawString("Just look at the colors", X, y);
      gr.drawString("in which you can buy", X, y += GAP);
      gr.drawString("this beautiful shirt", X, y += GAP);
      gr.drawString("Only $" + price, X, y += GAP);

      ++ counter;
   }
   public static void main(String[] args)
   {
      DebugSixteen4 frame = new DebugSixteen4();
      frame.setSize(350, 200);
      frame.setVisible(true);
   }
}