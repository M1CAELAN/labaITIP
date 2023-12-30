public class Sword extends Weapon {
    private String name_of_steel;
    private String handle_material;
    private int blade_length;
    
    public Sword(String name, int damage, int cost, String name_of_steel, String handle_material, int blade_length) {
        super(name, damage, cost);
        this.name_of_steel = name_of_steel;
        this.blade_length = blade_length;
        this.handle_material = handle_material;
    }
    
    @Override
    public void buy(){
        System.out.println("Вы купили меч " + getName() + " за " + getCost() + " злотых с храктарестиками: \n Урон -" + getDamage() +
                                                                                                        "\n Материал стали - " + getSteel() +
                                                                                                        "\n Материал рукоятки - " + getHandle() +
                                                                                                        "\n Длинной клинка - " + getBlade());
    }
    
    @Override
    public void attack() {
        System.out.println("Вы бьёте мечём с уроном " + getDamage());
    }

    public String getSteel() {
        return name_of_steel;
    }

    public String getHandle(){
        return handle_material;
    }

    public int getBlade() {
        return blade_length;
    }
}
