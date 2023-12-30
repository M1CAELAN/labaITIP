public class Main {
    public static void main(String[] args) {
        Sword sword1 = new Sword("Экскалебур",600, 5000, "Дамаск", "Кожа", 20);
        sword1.buy();
        sword1.attack();
        System.out.println();
        Bow bow1 = new Bow("Лук дедалы",20,500,"обычные стрелы", 200,50);
        bow1.buy();
        bow1.attack();
        System.out.println();
        The_magic_wand wand = new The_magic_wand();
        System.out.println(wand.getType());
        wand.setType("Некротический");
        wand.buy();
        wand.attack();
        System.out.println();
        sword1.setCost(10000);
        System.out.println("Новая цена " + sword1.getName() + " - " + sword1.getCost() + " злотых");
        System.out.println();
        System.out.println("Всего оружия - " + Weapon.getTotalWeapons());
        System.out.println(wand.getDamage());
    }

}
