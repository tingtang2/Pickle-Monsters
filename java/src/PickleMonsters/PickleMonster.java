package src.PickleMonsters;
import src.CoordinateSystem;

import java.awt.Image;
import java.awt.Graphics;
import java.util.*;

public abstract class PickleMonster {

    String name;
    private int health, attackDamage, numPotions;
    Image pic;
    CoordinateSystem coordinates;

    public PickleMonster(int h, int ap, int np, String n, Image p, int x, int y) {
        this.health = h;
        this.attackDamage = ap;
        this.numPotions = np;
        this.name = n;
        this.pic = p;
        coordinates = new CoordinateSystem(x, y, p);
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
    public void draw(Graphics g)
    {
        coordinates.drawImage(g, pic);
    }

    abstract public void kill();
}
