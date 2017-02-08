package h04;
import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */
    public class Tekenen4 extends Applet {

    public void init () {}


    public void paint (Graphics g) {
        g.drawLine(30,20,30,230);
        g.drawLine(30,230,280,230);
        g.drawLine(30,77,40,77);
        g.drawLine(30,153,40,153);
        g.drawLine(30,20,40,20);

        g.drawString( "50" , 5,153);
        g.drawString( "100", 5,77);
        g.drawString("150",5,20);
        g.drawString("0", 5,230);

        g.setColor(Color.blue);
        g.fillRect(55,170,65,60);
        g.setColor(Color.magenta);
        g.fillRect(135,77,65,153);
        g.setColor(Color.GREEN);
        g.fillRect(215,105,65,125);

        g.setColor(Color.black);
        g.drawString("Valerie",65,250);
        g.drawString("Jeroen",146,250);
        g.drawString("Hans",230,250);


     }
}
