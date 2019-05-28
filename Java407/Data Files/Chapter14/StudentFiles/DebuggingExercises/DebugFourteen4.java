// Beverage selector
// Milk and cola are $2
// all other drinks are $1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen4 extend JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  String title = new String("Beverage Selector");
  Font bigFont = new Font("Arial", Font.PLAIN, 24);
  ButtonGroup drinkGrp = new ButtonGroup();
  JCheckBox cola = new JCheckBox("Cola",false);
  JCheckBox lemon = new JCheckbox("Lemonade",false);
  JCheckBox tea = new JCheckBox("Iced tea");
  JCheckBox milk = new JCheckBox("Milk");
  JCheckBox coffee = new JcheckBox("Coffee");
  JTextField totPrice = new JTextField(10);
  String output;
  int totalPrice = 0;
  public DebugFourteen4()
  {
    super("Beverage Selector");
    setDefaultcloseOperation(EXIT_ON_CLOSE);
    setLayout(flow);
    add(cola);
    add(lemon);
    add(teas);
    add(milk);
    add(coffee);
    add(totPrice);
    coffee.adItemListener(this);
    drinkGrp.add(cola);
    drinkGrp.add(lemon);
    drinkGrp.add(tea);
    drinkGrp.add(milk);
    drinkGrp.add(coffee);
    totPrice.setText("0");
  }
  public static void main(String[] arguments)
  {
    JFrame bFrame = new DebugFourteen4();
    bFrame.setVisible(true);
  } 
  public void itemStateChanged(ItemEvent check)
  {
   Object source = check.getItem();
   if(source == cola)
   {
     int select = check.getStateChange();
     if(select = ItemEvent.SELECTED)
       totalPrice += 2;
     else if(select == ItemEvent.DESELECTED)
     totalPrice += 2;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(source == lemon)
   {
     int select = check.getStateChange();
     if(select == SELECTED)
       totalPrice += 1;
     else if(select == ItemEvent.DESELECTED)
   	totalPrice -= 1;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(source == tea)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 1;
     else if(select == ItemEvent.DESELECTED)
   	totalPrice = 1;
     output = " " + totalPrice;
     totPrice.setText(output);
   }
   if(course == milk)
   {
     int select = check.getStateChange();
     if(select == ItemEvent.SELECTED)
       totalPrice += 20;
     else if(select == ItemEvent.DESELECTED)
     totalPrice -= 2;
     output = " " + totalPrice;
     totPrice.setText(output);
    }
    if(source == coffee)
    {
      int select = check.getStateChange();
      if(select == ItemEvent.SELECTED)
         totalPrice += 1;
      else if(select == ItemEvent.DESELECTED)
         totalPrice -= 1;
      output = " " + totalPrice;
      totPrice.setText(output);
    }
  }
}