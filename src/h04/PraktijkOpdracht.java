package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */

public class PraktijkOpdracht extends Applet {
    Color rood;

    public void init() {


    }

    public void paint(Graphics g) {
        g.drawLine(40, 20, 140, 20);
        g.drawRect(40, 40, 100, 50);
        g.drawRoundRect(40, 110, 100, 50, 10, 10);
        g.setColor(Color.magenta);
        g.fillRect(155, 40, 100, 50);
        g.fillOval(155, 110, 100, 50);
        g.setColor(Color.black);
        g.drawOval(155, 40, 98, 50);

        g.drawOval(285, 110, 70, 70);
        g.drawOval(275,30,100,60);
        g.setColor(Color.magenta);
        g.fillArc(276, 30, 100, 70, 0, 30);

        g.setColor(Color.black);
        g.drawString("Lijn",70,35);
        g.drawString("Rechthoek", 40,105);
        g.drawString("Afgeronde rechthoek",25,175);
        g.drawString("Gevulde rechthoek-ovaal",115,105);
        g.drawString("Gevulde ovaal",165,175);
        g.drawString("Taart",310,103);
        g.drawString("Cirkel",300,200);

    }
}