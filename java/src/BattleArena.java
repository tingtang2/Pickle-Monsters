package src;

import com.sun.istack.internal.NotNull;
import src.PickleMonsters.PickleMonster;

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

    public void playerAttacked() {

    }

    public void opponentAttacked() {

    }

    public void playerUsedPotion() {

    }

    public void opponentUsedPotion() {

    }
}
