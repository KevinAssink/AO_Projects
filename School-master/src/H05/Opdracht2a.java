package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2a extends Applet {

    int weide;
    int jeroen;
    Color Jeroen;

    public void init() {
        setBackground(Color.white);

        weide = 75;
        jeroen = 50;
        Jeroen = Color.black;

    }

    public void paint(Graphics g) {
        //grafiek
        g.drawRect(100, 10, 300, 300);
        g.setColor(Color.red);
        g.fillRect(110, 10, weide, 300);
        g.setColor(Color.green);
        g.fillRect(210, 70, weide, 240);
        g.setColor(Color.yellow);
        g.fillRect(310, 190,weide,120);
        //y
        g.setColor(Color.BLACK);
        g.drawString("0",90, 310);
        g.drawString("20", 85, 250);
        g.drawString("40", 85, 190);
        g.drawString("60", 85, 130);
        g.drawString("80", 85, 70);
        g.drawString("100", 80, 10);
        //namen
        g.drawString("Jeroen is 100 kg", 410, 110);
        g.drawString("Valerie is 40 kg", 410, 130);
        g.drawString("Hans is 80 kg ", 410, 150);
        g.drawString("Jeroen", 110, 340);
        g.drawString("Hans", 210, 340);
        g.drawString("Valerie", 310, 340);
        //x en y as
        g.drawString("Kilogram", 20, 10);
        g.drawString("Namen", 410, 340);

        g.setColor(Jeroen);
        g.fillOval(500,500,jeroen,50);

    }
}