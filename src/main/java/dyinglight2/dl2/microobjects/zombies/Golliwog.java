package dyinglight2.dl2.microobjects.zombies;

import java.util.concurrent.ThreadLocalRandom;

public class Golliwog extends Zombie {
    public Golliwog(String name, String base, int lvl, double health, int damage) {
        super(name, base, lvl, health, damage);
        System.out.println("Golliwog constructor has been called");
    }

    public Golliwog() {
        super("golliwog-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "waterStation", 2, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("Golliwog constructor has been called");
    }

    public void heal() {
        System.out.println("'zombie voices' (heal)");
        if (health < 100) {
            health+=5;
        }
    }

    @Override
    public String toString() {
        return "Golliwog{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
