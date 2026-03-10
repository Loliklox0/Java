package MyGraph;

import java.awt.*;
import javax.swing.*;

public class X2 extends JFrame {

    X2(String s){
        super(s);
        setSize(400,300);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.setColor(Color.LIGHT_GRAY);

        for(int i=0;i<400;i+=20)
            g.drawLine(i,0,i,300);

        for(int i=0;i<300;i+=20)
            g.drawLine(0,i,400,i);

        g.setColor(Color.BLACK);

        g.drawLine(0,150,400,150);
        g.drawLine(200,0,200,300);

        for(int x=-100;x<=100;x++){

            int y=(x*x)/10;

            g.fillOval(200+x,150-y,2,2);
        }
    }
}