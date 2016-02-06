package src;

import src.PickleMonsters.PickleMonster;

/**
 * Created by billma on 2/5/16.
 */
public interface BattleArenaDelegate {

    void playerWasKilled();
    void opponentWasKilled();

    void playerRanAway();

    void playerUsedPotion(int heal);
    void opponentUsedPotion(int heal);

    void playerAttacked(int damage);
    void opponentAttacked(int damage);

}
