package h04;
import java.awt.*;
import java.applet.*;
/**
 * Created by Oemed on 07-02-17.
 */
public class Tekenen3 extends Applet {

    public void init() {}

    public void paint (Graphics g) {

        g.fillRoundRect(10, 10, 10, 230, 10, 10);
        g.setColor(Color.red);
        g.fillRect(20,13,150,40);
        g.setColor(Color.white);
        g.fillRect(20,48,150,40);
        g.setColor(Color.blue);
        g.fillRect(20,85,150,40);

    }
}
