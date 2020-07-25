import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UseBalloon2 extends JFrame implements ActionListener {
    private JButton growButton, moveButton;
    private JPanel panel;

    private Balloon2 balloon;

    public static void main(String[] args) {
        UseBalloon2 demo = new UseBalloon2();
        demo.setSize(250,300);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.white);
        window.add(panel);

        moveButton = new JButton("move");
        window.add(moveButton);
        moveButton.addActionListener(this);

        growButton = new JButton("grow");
        window.add(growButton);
        growButton.addActionListener(this);

        balloon = new Balloon2();
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        if (event.getSource() == moveButton)
            balloon.moveRight(20);
        else
            balloon.changeSize(20);
        paper.setColor(Color.white);
        paper.fillRect(0,0,150,150);
        balloon.display(paper);
    }
}

class Balloon2 {
    private int x = 50;
    private int y = 50;
    private int diameter = 20;
    private String name = "Ballon2";


    public void moveRight(int xStep) {
        x += xStep;
    }

    public void moveLeft(int xStep) {
        x -= xStep;
    }

    public void moveUp(int yStep) {
        y += yStep;
    }

    public void moveDown(int yStep) {
        y -= yStep;
    }

    public void changeSize(int change) {
        diameter += change;
    }

    public void display(Graphics paper) {
        paper.setColor(Color.black);
        paper.drawOval(x,y,diameter,diameter);
    }
}
