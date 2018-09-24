import java.awt.*;
public class SimpleFigure {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250,200);
        Graphics g = panel.getGraphics();
        g.setColor(Color.YELLOW);
    }
}