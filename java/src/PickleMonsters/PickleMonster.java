package src.PickleMonsters;

public abstract class PickleMonster {

    String name;
    private int health, attackDamage, numPotions;

    public PickleMonster(int h, int ap, int np, String n) {
        this.health = h;
        this.attackDamage = ap;
        this.numPotions = np;
        this.name = n;
    }

    public int getHealth(){
        return health;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getNumPotions(){
        return numPotions;
    }
    public String getName(){
        return name;
    }

    abstract public void kill();
}
