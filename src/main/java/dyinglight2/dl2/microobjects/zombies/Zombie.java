package dyinglight2.dl2.microobjects.zombies;

import java.util.concurrent.ThreadLocalRandom;

public class Zombie {
    String name;
    String base;
    int lvl;
    double health;
    int damage;

    public Zombie(String name, String base, int lvl, double health, int damage) {
        System.out.println("Zombie constructor has been called");
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
        this.damage = damage;
    }

    public Zombie() {
        this("zombie-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "waterStation", 1, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
    }
    public void attack(){
        System.out.println("'zombie voices' (attack)");
    }

    public void cover(){
        System.out.println("'zombie voices' (cover)");
    }

    public void run(){
        System.out.println("'zombie voices' (run)");
    }

    public void lowHp(){
        if (health < 10) {
            System.out.println("'zombie voices' (lowHp)");
        }
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
