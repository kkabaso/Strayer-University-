// Applet tells you whether you
// have pressed a button an even or
// odd number of times
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugSeventeen3 extends Japplet implements ActionListener
{
   Font aFont = new Font("Serif", Font.PLAIN, 20);
   JLabel theLabel = new JLabel("Press the button");
   JButton button = new JButton("Press");
   int count = 0;
   public void init()
   {
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      con.add (button);
      con.add(thLabel);
      theLabel.setFont(aFont);
      button.addListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      if(count % 2 == 1)
         theLabel.setText("Odd");
      else
         theLabel.setText("Even");
   }
}