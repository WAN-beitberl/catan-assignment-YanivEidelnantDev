import java.awt.*;
import javax.swing.*;
public class Player {
    private final String name;
    private final Color color;


    public Player(String n, Color c)
    {
        name = n;
        color = c;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
