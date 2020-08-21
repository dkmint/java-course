import javax.swing.*;
import java.awt.*;

public class Alphabet extends JFrame {
    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Burglar");
        JButton c = new JButton("Corpse");
        JButton d = new JButton("DeadBeat");
        JButton e = new JButton("Evidence");
        JButton f = new JButton("Fugitive");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception e) {
            System.err.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        Alphabet frame = new Alphabet();
    }
}
