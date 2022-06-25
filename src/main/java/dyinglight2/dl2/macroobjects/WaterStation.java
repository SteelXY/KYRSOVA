package dyinglight2.dl2.macroobjects;

import java.util.List;

public class WaterStation {
    private final List<Object> units;

    public WaterStation(List<Object> units) {
        this.units = units;
    }

    public List<Object> getUnits() {
        return units;
    }

    public int getAmountOf(String type) {
        int amount = 0;
        for(int i = 0; i < units.size(); i++){
            if(units.get(i).getClass().getName().contains(type)){
                amount++;
            }
        }
        return amount;
    }

    public void addUnit(Object s) {
        units.add(s);
    }

    public void removeAllUnits() {
        units.clear();
    }

    @Override
    public String toString() {
        return "WaterStation{" +
                "units=" + units +
                '}';
    }
}