// JApplet asks user to minimize or maximize it
// and thanks the user when applet is restored
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugSeventeen2 extends JApplet
{
   JLabel messageOne = new JLabel("Minimize or maximize me");
   JLabel messageTwo = new JLabel("                      ");
   String msg = new String("");

   public void init()
   {
      Container com = getContentPane();
      con.setLayout(new FlowLayout());
      con.add(messageOne);
      con.add(messageTwo);
      msg = "  Please......           ";
      display;
   }

   public void display()
   {
      messageTwo.setText(messg);
   }

   public void stop()
   {
      msg = "Thanks for restoring me!";
      display()
   }
}