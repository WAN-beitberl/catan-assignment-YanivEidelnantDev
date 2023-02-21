import java.awt.*;
public class Road {
    private Player owner = null;

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private int width;
    private int height;

    public Road(int X1, int Y1, int X2, int Y2)
    {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        width = x2-x1;
        height = y2-y1;
    }

    public void drawRoad(Graphics2D g)
    {
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;
        double rotationAngle = Math.atan2(height, width);
        System.out.println(x1 + " " + y1);
        System.out.println(x2 + " " + y2);
        System.out.println(width);
        System.out.println(height);
        System.out.println(rotationAngle);
        g.rotate(rotationAngle, midX, midY);
        g.fillRect(x1+5, y1+10, width-10, 8);
    }
}
