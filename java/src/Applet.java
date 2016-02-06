package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Applet extends JApplet implements ActionListener {

    Random random = new Random();
    JRadioButton run, attack, potion;

    public void init() {
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2, 2));

        run = new JRadioButton("Run");
        attack = new JRadioButton("Attack");
        potion = new JRadioButton("Potion");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(run);
        buttonGroup.add(attack);
        buttonGroup.add(potion);

        buttons.add(run);
        buttons.add(attack);
        buttons.add(potion);

        JPanel battle = new JPanel();

        Container c = getContentPane();
        c.add(buttons, BorderLayout.NORTH);
        c.add(battle);

        JButton startAction = new JButton("Perform Action");
        startAction.addActionListener(this);

        c.add(startAction, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (run.isSelected()) {
            run();
        } else if (attack.isSelected()) {
            attack();
        } else if (potion.isSelected()) {
            usePotion();
        } else {
            System.out.println("Unimplemented button selected");
        }
    }

    public void run() {

    }

    public void attack() {

    }

    public void usePotion() {

    }

}
