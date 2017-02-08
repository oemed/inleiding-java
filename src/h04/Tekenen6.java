package h04;
import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */
public class Tekenen6 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
      g.fillRect(40,30,100,100);
      g.setColor(Color.white);
      g.fillOval(60,50,20,20);
      g.fillOval(100,50,20,20);
      g.fillOval(60,90,20,20);
      g.fillOval(100,90,20,20);

    }

}