



import src.BattleArenaDelegate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class Applet extends JApplet implements ActionListener, BattleArenaDelegate {

    JRadioButton runButton, attackButton, potionButton;
    Image player, oppo;

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

        JPanel battle = new JPanel(new GridLayout(1, 1));


        Container c = getContentPane();
        c.add(buttons, BorderLayout.NORTH);
        c.add(battle, BorderLayout.CENTER);

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
        Random random = new Random();

        if (random.nextInt(arena.opponent.getMaxHealth()) < arena.opponent.getHealth()) {
            arena.opponent.usePotion(50);}
        else
            arena.opponent.dealDamage(50);
    }

    @Override
    public void opponentAttacked(int damage) {


    }

    @Override
    public void opponentUsedPotion(int heal) {

    }


    @Override
    public void opponentWasKilled() {

    }

    @Override
    public void playerAttacked(int damage) {
        JOptionPane.showMessageDialog(null, "You took " + damage + " damage");
        int percent = damage / arena.player.getHealth();
    }

    @Override
    public void playerUsedPotion(int heal) {
        JOptionPane.showMessageDialog(null, "You healed for " + heal + " points!");
    }

    @Override
    public void playerRanAway() {
        JOptionPane.showMessageDialog(null, "You win!!");
    }

    @Override
    public void playerWasKilled() {
        JOptionPane.showMessageDialog(null, "You have been killed :(");
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.GREEN);
        player = getImage(getCodeBase(), "PickleTwo.gif");
        oppo = getImage(getCodeBase(), "BlastPickle.gif");
        g.drawImage(player, 50, 50, this);
        g.drawImage(oppo, 1000, 50, this);
        g.fill3DRect(50, 125, 400, 30, true);
        g.fill3DRect(1000, 125, 400, 30, true);
        g.setColor(Color.BLUE);
        g.drawString("HP:",50, 100);
        g.drawString("HP:",1000, 100);
    }

}

