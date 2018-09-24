import java.awt.*;
public class SimpleFigure {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250,200);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.YELLOW);
        g.setColor(Color.green);
        g.fillRect(10, 20, 200, 160);
        g.setColor(Color.red);
        g.fillOval(10, 20, 100, 80);
        g.fillOval(110, 100, 100, 80);
        g.setColor(Color.black);
        g.drawLine(10, 60, 110, 60);
        g.drawLine(60, 20, 60, 100);
        g.drawLine(110, 140, 210, 140);
        g.drawLine(160, 100, 160, 180);
    }
}