package h06;
import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 15-03-17.
 */
public class Opdracht2 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int uitkomst;
    int uitkomstt;
    int uitkomsttt;


public void init() {
    a = 60;
    b = 60;
    c = 24;
    d = 365;
    uitkomst = a * b;
    uitkomstt = uitkomst * c;
    uitkomsttt = uitkomstt * d;


}

public void paint (Graphics g) {
    g.drawString("seconden in een uur: " + uitkomst , 30,30);
    g.drawString("seconden in een dag: " + uitkomstt , 30,50);
    g.drawString("Seconden in een jaar:  " + uitkomsttt , 30,70);
   }

}