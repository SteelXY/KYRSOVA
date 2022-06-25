package dyinglight2.dl2.macroobjects;

import java.util.List;

public class Peacekeepers {
    private final List<Object> units;

    public Peacekeepers(List<Object> units) {
        this.units = units;
    }

    public List<Object> getUnits() {
        return units;
    }

    public int getAmountOf(String type) {
        int amount = 0;
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).getClass().getName().contains(type)) {
                amount++;
            }
        }
        return amount;
    }

    public void addUnit(Object b) {
        units.add(b);
    }

    public void removeAllUnits() {
        units.clear();
    }

    @Override
    public String toString() {
        return "Peacekeepers{" +
                "units=" + units +
                '}';
    }
}
