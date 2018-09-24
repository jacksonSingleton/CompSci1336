import java.awt.*;
public class Circles {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400,425);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.cyan);
        patternGenerator(g, 100, 0, 0, 1, 10);
        patternGenerator(g, 24, 18, 175, 6, 4);
        patternGenerator(g, 40, 180, 25, 5, 5);
        patternGenerator(g, 36, 180, 250, 4, 6);
        


    }
    public static void drawCircle(Graphics g, int size, int x, int y, int circleCount) {
        g.setColor(Color.green);
        g.fillRect(x, y, size, size);
        g.setColor(Color.yellow);
        g.fillOval(x, y, size, size);
        g.setColor(Color.black);
        g.drawRect(x, y, size, size);
        g.drawOval(x, y, size, size);
        //X Top Left to Bottom Right
        g.drawLine(x, y, size+x, size+y);
        //X Bottom Left to Top Right
        g.drawLine(x, size+y, size+x, y);
        //Horizontal Mid
        g.drawLine(x, y+size/2, size+x, size/2+y);  
        //Vertical Mid
        g.drawLine(size/2+x, y, size/2+x, size+y);
        for (int circles = 1; circles < circleCount; circles++) {
            //g.drawOval((x+(size/2))-((size/circles)/2),(y+(size/2))-((size/circles)/2),size/circles, size/circles);
            int factor = size-((size/circleCount)*circles);
            g.drawOval((x+(size/2))-(factor/2),(y+(size/2))-(factor/2),factor, factor);
        }
    }
    public static void patternGenerator(Graphics g, int scale, int x, int y, int grid, int circles) {
        for (int i = 0; i < grid; i++) {
            drawCircle(g,scale,scale*i + x, 0+ y, circles);
            for (int j = 0; j < grid; j++) {
                drawCircle(g,scale,scale*i + x,scale*j + y,circles);
            }
        }
    }
    
}