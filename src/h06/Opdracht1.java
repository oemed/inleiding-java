package h06;
import java.awt.*;
import java.applet.*;

/**
 * Created by Oemed on 07-02-17.
 */


//Voorbeeld 6.1


public class Opdracht1 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;



    public void init() {
        a = 113;
        b = 4;
        c = 0;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst , 20, 20);
        g.drawString("Jan 28 euro" , 20,40);
        g.drawString("Ali 28 euro" , 20,60);
        g.drawString("Jeanette 28 euro" , 20,80);
        g.drawString("Ik 28 euro" , 20,100);
    }
}