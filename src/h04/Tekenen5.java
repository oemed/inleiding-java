package h04;
import com.sun.javafx.css.converters.ColorConverter;

import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */
public class Tekenen5 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {

        g.fillRect(100, 30, 80, 200);
        g.fillRoundRect(130,230,20,100,10,10);

        g.setColor(Color.red);
        g.fillOval(110,40,60,60);
        g.setColor(Color.orange);
        g.fillOval(110,100,60,60);
        g.setColor(Color.green);
        g.fillOval(110,160,60,60);

    }
}