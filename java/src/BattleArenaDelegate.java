package src;

import src.PickleMonsters.PickleMonster;

/**
 * Created by billma on 2/5/16.
 */
public interface BattleArenaDelegate {

    void monsterWasKilled(PickleMonster monster);
    void monsterRanAway(PickleMonster monster);
    void monsterUsedPotion(PickleMonster monster, int heal);
    void monsterAttacked(PickleMonster monster, int damage);

}
