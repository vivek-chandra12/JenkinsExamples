import java.applet.*;
import java.awt.*;
/*<applet code="MyApplet1.class" width="400" height="400">
</applet>*/
public class MyApplet1 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World",100,150);
g.drawLine(100,1200,300,400);
g.drawRect(250,375,30,50);
}
}

