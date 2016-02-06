package src;

import src.PickleMonsters.PickleMonster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Applet extends JApplet implements ActionListener, BattleArenaDelegate {

    Random random = new Random();
    JRadioButton runButton, attackButton, potionButton;

    BattleArena arena;

    public void init() {
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2, 2));

        runButton = new JRadioButton("Run");
        attackButton = new JRadioButton("Attack");
        potionButton = new JRadioButton("Potion");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(runButton);
        buttonGroup.add(attackButton);
        buttonGroup.add(potionButton);

        buttons.add(runButton);
        buttons.add(attackButton);
        buttons.add(potionButton);

        JPanel battle = new JPanel();

        Container c = getContentPane();
        c.add(buttons, BorderLayout.NORTH);
        c.add(battle);

        JButton startAction = new JButton("Perform Action");
        startAction.addActionListener(this);

        c.add(startAction, BorderLayout.SOUTH);

        configureArena();
    }

    public void configureArena() {
        arena = null;
    }

    public void actionPerformed(ActionEvent e) {
        if (runButton.isSelected()) {
            arena.runAway();
        } else if (attackButton.isSelected()) {
            arena.playerAttacked();
            moveOpponent();
        } else if (potionButton.isSelected()) {
            arena.playerUsedPotion();
            moveOpponent();
        } else {
            System.out.println("Unimplemented button selected");
        }
    }

    public void moveOpponent() {

    }

    public void monsterWasKilled(PickleMonster monster) {

    }

    public void monsterRanAway(PickleMonster monster) {

    }

    public void monsterUsedPotion(PickleMonster monster, int heal) {

    }

    public void monsterAttacked(PickleMonster monster, int damage) {

    }

}
