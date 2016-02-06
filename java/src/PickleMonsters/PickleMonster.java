package src.PickleMonsters;

public abstract class PickleMonster {

    String name;
    private int health, maxHealth, attackDamage, numPotions;
    public PickleMonster(int h, int ap, int np, String n) {
        this.health = h;
        this.maxHealth = h;
        this.attackDamage = ap;
        this.numPotions = np;
        this.name = n;
    }

    public int getHealth(){
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
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

    public void kill() {
        health = 0;
    }

    public void dealDamage(int damage) {
        health -= damage;
    }
    public boolean hasDied() {
        return health <= 0;
    }
}
