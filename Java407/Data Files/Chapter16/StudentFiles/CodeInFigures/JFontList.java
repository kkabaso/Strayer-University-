import javax.swing.*;
import java.awt.*;
public class JFontList extends JFrame
{
   public void paint(Graphics gr)
   {
      super.paint(gr);
      int i, x, y = 40;
      final int VERTICAL_SPACE = 10;
      final int HORIZONTAL_SPACE = 160;
      GraphicsEnvironment ge =
         GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] fontnames = ge.getAvailableFontFamilyNames();
      for(i = 0; i < fontnames.length; i += 5)
      {
         x = 10;
         gr.setFont(new Font("Arial", Font.PLAIN, 10));
         gr.drawString(fontnames[i], x, y);
         if(i + 1 < fontnames.length)
            gr.drawString(fontnames[i + 1], x += HORIZONTAL_SPACE, y);
         if(i + 2 < fontnames.length)
            gr.drawString(fontnames[i + 2], x += HORIZONTAL_SPACE, y);
         if(i + 3 < fontnames.length)
            gr.drawString(fontnames[i + 3], x += HORIZONTAL_SPACE, y);
         if(i + 4 < fontnames.length)
            gr.drawString(fontnames[i + 4], x += HORIZONTAL_SPACE, y);
         y = y + VERTICAL_SPACE;
      }
   }
   public static void main(String[] args)
   {
      JFontList frame = new JFontList();
      frame.setSize(820, 620);
      frame.setVisible(true);
   }
}
