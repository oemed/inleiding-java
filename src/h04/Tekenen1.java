package h04;
import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */

    public class Tekenen1 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            g.drawLine(20, 20, 200, 20);
            g.drawLine(20, 20, 100, 100);
            g.drawLine(100, 100, 200, 20);

        }
    }
