package src;
public abstract class Pickle_Monster {
    String name;
    private int health, attackDamage, numPotions;
    public Pickle_Monster(int h, int ap, int np, String n){
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
}
