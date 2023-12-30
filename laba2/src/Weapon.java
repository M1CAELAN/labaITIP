public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int cost;
    public static int totalWeapons = 0;
    public Weapon(String name, int damage, int cost) {
        this.name = name;
        this.damage = damage;
        this.cost = cost;
        totalWeapons += 1;
    }
    
    public abstract void buy();
    
    public abstract void attack();
    
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int getTotalWeapons() {
        return totalWeapons;
    }
}