package dyinglight2.dl2.microobjects.zombies;

import java.util.concurrent.ThreadLocalRandom;

public class Volatile extends Golliwog{
    public Volatile() {
        super("volatile-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "waterStation" , 3, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("Volatile constructor has been called");
    }

    @Override
    public void heal() {
        System.out.println("'zombie voices' (heal)");
        if (health < 100) {
            health += 10;
        }
    }

    @Override
    public String toString() {
        return "Volatile{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
