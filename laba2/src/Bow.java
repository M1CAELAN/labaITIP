public class Bow extends Weapon {
    private String type_of_ammunition;
    private int range;
    private int tension_force;
    public Bow(String name, int damage, int cost, String type_of_ammunition, int range, int tension_force) {
        super(name, damage, cost);
        this.type_of_ammunition = type_of_ammunition;
        this.range = range;
        this.tension_force = tension_force;
    }
    
    @Override
    public void buy() {
        System.out.println("Вы купили лук " + getName() + " за " + getCost() + " злотых с храктарестиками: \n Урон -" + getDamage() +
                "\n Тип боеприпасов - " + getAmmunition() +
                "\n Дистация стрельбы - " + getRange() +
                "\n Сила натяжения - " + getForce());
    }

    @Override
    public void attack() {
        System.out.println("Вы стреляете из лука с уроном " + getDamage());
    }  
    public String getAmmunition() {
        return type_of_ammunition;
    }
    
    public int getRange() {
        return range;
    }

    public int getForce(){
        return tension_force;
    }
}