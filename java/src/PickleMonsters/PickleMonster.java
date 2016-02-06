package src.PickleMonsters;

import src.CoordinateSystem;
import java.awt.Image;
import java.awt.Graphics;

public abstract class PickleMonster {

    String name;
    private int health, maxHealth, attackDamage, numPotions;
    private Image picture;
    private CoordinateSystem coordinates;

    public PickleMonster(int h, int ap, int np, String n, int x, int y, Image pic) {
        this.health = h;
        this.maxHealth = h;
        this.attackDamage = ap;
        this.numPotions = np;
        this.name = n;
        this.picture = pic;
        this.coordinates = new CoordinateSystem(x, y, pic);
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
