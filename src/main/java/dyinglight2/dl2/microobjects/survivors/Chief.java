package dyinglight2.dl2.microobjects.survivors;

import java.util.concurrent.ThreadLocalRandom;

public class Chief extends Sheriff {
    public Chief() {
        super("chief-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "survivorsBase", 3, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("Chief constructor has been called");
    }

    @Override
    public void heal() {
        System.out.println("I am healing");
        if (health < 100) {
            health += 10;
        }
    }

    @Override
    public String toString() {
        return "Chief{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
