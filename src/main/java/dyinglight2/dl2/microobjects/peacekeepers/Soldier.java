package dyinglight2.dl2.microobjects.peacekeepers;

import java.util.concurrent.ThreadLocalRandom;

public class Soldier {
     String name;
     String base;
     int lvl;
     double health;
     int damage;

    public Soldier(String name, String base, int lvl, double health, int damage) {
        System.out.println("Soldier constructor has been called");
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
        this.damage = damage;
    }

    public Soldier() {
        this("soldier-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "peacekeepersBase", 1, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
    }
    public void attack(){
        System.out.println("I am attacking!");
    }

    public void cover(){
        System.out.println("I am covering!");
    }

    public void run(){
        System.out.println("I am running!");
    }

    public void lowHp(){
        if (health < 10) {
            System.out.println("I am low HP!");
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
        return "Soldier{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}