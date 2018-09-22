import java.awt.*;
public class Stairs2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for (int i = 10; i >= 1; i--) {
            g.drawRect(5, (10-i)*10+5, i*10, 10);
        }
    }
    
}