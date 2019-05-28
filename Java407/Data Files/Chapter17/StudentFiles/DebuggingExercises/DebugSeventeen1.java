// Personality test
// tells your personality
// based on favorite color
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class DebugSeventeen1 extends JApplet implements ActionListener
{
   Label question = new Label("What's your favorite color?");
   TextField response = new Textfield(4);
   Button pressButton = new Button("Press");
   Label profile = new Label("Personality profile will show up here");
   String letterResponse;
   public void init()
   {
      con.setLayout(new FlowLayout());
      con.add(question);
      con.add(response);
      con.add(pressButton);
      pressButton.addActionListener(these);
      con.add(profile);
   }

   public void actionPerformed(ActionEvent e)
   {
      String color = response.getText();
      if(color.equals("red"))
          profile.setText("Hot tempered  ");
          profile.setBackground(RED);
      else
        if(color.equals("blue"))
           profile.setText("Serene");
           profile.setBackground(Color.BLUE);
        else
        {
           profile.setText("Very friendly ")
           profile.setBackground(Color.YELLOW);
        }
   }
}