package src;

import com.sun.istack.internal.NotNull;
import src.PickleMonsters.PickleMonster;

import javax.swing.*;
import java.util.Random;

public class BattleArena {

    PickleMonster player, opponent;
    Random random;
    BattleArenaDelegate delegate;

    public BattleArena(PickleMonster player, PickleMonster opponent, BattleArenaDelegate delegate) {
        this.player = player;
        this.opponent = opponent;

        this.delegate = delegate;

        random = new Random();
    }

    public void runAway() {
        if (random.nextBoolean()) {
            delegate.playerRanAway();
        } else {
            player.kill();
            delegate.playerWasKilled();
        }
    }

    public PickleMonster getPlayer() {
        return player;
    }

    public PickleMonster getOpponent() {
        return opponent;
    }

    public void playerAttacked() {
        opponent.dealDamage(player.getAttackDamage());
    }

    public void opponentAttacked() {
        player.dealDamage(opponent.getAttackDamage());
    }

    public void playerUsedPotion() {
        if(player.getNumPotions() > 0)
        {
            Random rand = new Random();
            int r = rand.nextInt(100);
            player.usePotion(r);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You have no potions left");
        }
        JOptionPane.showMessageDialog(null, "You now have " + player.getNumPotions() + "potions left");
    }

    public void opponentUsedPotion() {
        if(opponent.getNumPotions() > 0)
        {
            Random rand = new Random();
            int r = rand.nextInt(100);
            opponent.usePotion(r);
        }
    }
    public void playerWasKilled(){
        JOptionPane.showMessageDialog(null, "You have been killed :(");
    }
    public void opponentWasKilled(){
        JOptionPane.showMessageDialog(null, "You win!!");
    }
}
