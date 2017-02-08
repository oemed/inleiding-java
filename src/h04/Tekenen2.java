package h04;
import java.awt.*;
import java.applet.*;
/**
 * Created by Oemed on 07-02-17.
 */

    public class Tekenen2 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
         g.drawRect(100,100,100,100 );
         g.drawLine(100,100,150,50);
         g.drawLine(200,100,150,50);
         g.drawRect(180,170,19,30);
         g.drawRect(120,120,30,30);
         g.drawLine(120,134,150,134);
         g.drawLine(135,120,135,150);
        }
    }

