package dyinglight2.dl2.macroobjects;

import dyinglight2.dl2.microobjects.peacekeepers.Soldier;
import dyinglight2.dl2.microobjects.survivors.Fighter;
import dyinglight2.dl2.microobjects.zombies.Zombie;

import java.util.List;

public class InfectedCity {
    List<Object> macroObjects;
    List<Soldier> soldiers;
    List<Fighter> fighters;
    List<Zombie> zombies;

    public InfectedCity(List<Object> macroObjects, List<Soldier> soldiers, List<Fighter> fighters, List<Zombie> zombies) {
        this.macroObjects = macroObjects;
        this.soldiers = soldiers;
        this.fighters = fighters;
        this.zombies = zombies;
    }


}
