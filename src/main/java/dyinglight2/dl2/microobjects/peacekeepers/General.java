package dyinglight2.dl2.microobjects.peacekeepers;

import java.util.concurrent.ThreadLocalRandom;

public class General extends Commander {
    public General() {
        super("general-" + ThreadLocalRandom.current().nextInt(1, 50 + 1), "peacekeepersBase" , 3, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
        System.out.println("General constructor has been called");
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
        return "General{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
