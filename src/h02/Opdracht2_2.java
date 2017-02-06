package h02;
import java.awt.*;
import java.applet.*;

    //een klasse met de naam Show van het type Applet
    public class Opdracht2_2 extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {
            setBackground(Color.white);

        }

        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Oemed", 50, 60 );

            g.setColor(Color.red);
            g.drawString("Al-ali", 50, 75 );


        }

    }
