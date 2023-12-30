public class The_magic_wand extends Weapon {
    private String type_of_damage;

    public The_magic_wand() {
        super("Волшебная палочка", 120, 8000);
    }

    @Override
    public void buy() {
        System.out.println("Вы купили волшебную палочку " + getName() + " за " + getCost() + " злотых с храктарестиками: \n Урон -" + getDamage() +
                "\n Тип урона  - " + getType());
    }

    @Override
    public void attack() {
        System.out.println("Вы стреляете магическим зарядом с уроном " + getDamage() + " тип урона" + getType());
    }
    public void setType(String type_of_damage) {
        this.type_of_damage = type_of_damage;
    }
    public String getType() {
        return type_of_damage;
    }

}
