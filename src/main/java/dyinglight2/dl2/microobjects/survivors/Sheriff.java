package dyinglight2.dl2.microobjects.survivors;

import java.util.concurrent.ThreadLocalRandom;

public class Sheriff extends Fighter {
    public Sheriff(String name, String base, int lvl, double health, int damage) {
        super(name, base, lvl, health, damage);
        System.out.println("Sheriff constructor has been called");
    }

    public Sheriff() {
        super("sheriff-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "survivorsBase", 2, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("Sheriff constructor has been called");
    }

    public void heal() {
        System.out.println("I am healing");
        if (health < 100) {
            health+=5;
        }
    }

    @Override
    public String toString() {
        return "Sheriff{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
