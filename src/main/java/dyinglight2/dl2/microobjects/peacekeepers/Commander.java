package dyinglight2.dl2.microobjects.peacekeepers;

import java.util.concurrent.ThreadLocalRandom;

public class Commander extends Soldier{
    public Commander(String name, String base, int lvl, double health, int damage) {
        super(name, base, lvl, health, damage);
        System.out.println("Commander constructor has been called");
    }

    public Commander() {
        super("commander-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "peacekeepersBase", 2, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("Commander constructor has been called");
    }

    public void heal() {
        System.out.println("I am healing");
        if (health < 100) {
            health+=5;
        }
    }

    @Override
    public String toString() {
        return "Commander{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
