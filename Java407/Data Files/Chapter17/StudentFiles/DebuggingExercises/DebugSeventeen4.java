// Computes property tax as 3.25% of property value
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugSeventeen4 extends JApplet implements ActionListener
{
   JLabel title = new JLabel("Property Tax Calculator");
   JLabel countyName = new JLabel("Opulent County");
   JButton calcButton = new JButton("Compute Tax");
   JLabel prompt = new JLabel("Enter the value of your property");
   JTextField propVal = new JTextField(8);
   JLabel taxBill = new JLabel("Your County Collector");
   Font bigFont = new Font("Helvetica", Font.ITALIC, 16);
   final double RATE = .0325;
   public void init()
   {
      Container con = getContentPane();
      con.setLayout(new flowLayout());
      title.setFont(bigFont);
      countyName.setFont(bigFont);
      taxBill.setFont(bigFont);
      con.add(title);
      con.add(countyName);
      con.add (prompt);
      con.add (propValue);
      calcButton.addActionListener(this);
      con.add(taxBill);
   }

   public void start()
   {
      propVal.setText("");
      propVal.requestFocus();
   }

   public void actionPerformed(ActionEvent e)
   {
      int value = Integer.parseInt(propVal.getText());
      doble tax = RATE * value;
      taxBillsetText("Property tax is $" + tax);
   }
}