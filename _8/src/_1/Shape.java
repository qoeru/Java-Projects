package _1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    protected String color;
    protected Position position;

    public Shape(String color, Position position) throws HeadlessException {
        this.color = color;
        this.position = position;
    }

    public void Draw(Graphics graphics) {}

}
