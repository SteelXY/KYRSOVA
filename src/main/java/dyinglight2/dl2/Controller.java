package dyinglight2.dl2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dyinglight2.dl2.macroobjects.Peacekeepers;
import dyinglight2.dl2.macroobjects.Survivors;
import dyinglight2.dl2.macroobjects.WaterStation;
import dyinglight2.dl2.microobjects.peacekeepers.Commander;
import dyinglight2.dl2.microobjects.peacekeepers.General;
import dyinglight2.dl2.microobjects.peacekeepers.Soldier;
import dyinglight2.dl2.microobjects.survivors.Chief;
import dyinglight2.dl2.microobjects.survivors.Fighter;
import dyinglight2.dl2.microobjects.survivors.Sheriff;
import dyinglight2.dl2.microobjects.zombies.Golliwog;
import dyinglight2.dl2.microobjects.zombies.Volatile;
import dyinglight2.dl2.microobjects.zombies.Zombie;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.util.Pair;

public class Controller {

    @FXML
    private Button addUnit;

    @FXML
    private Text chiefsText;

    @FXML
    private Text chiefsText1;

    @FXML
    private Text chiefsText2;

    @FXML
    private Button clearPeacekeepers;

    @FXML
    private Button clearSurvivors;

    @FXML
    private Button clearWaterStation;

    @FXML
    private Text commandersText;

    @FXML
    private Text commandersText1;

    @FXML
    private Text commandersText2;

    @FXML
    private Text fightersText;

    @FXML
    private Text fightersText1;

    @FXML
    private Text fightersText2;

    @FXML
    private Text generalsText;

    @FXML
    private Text generalsText1;

    @FXML
    private Text generalsText2;

    @FXML
    private Text golliwogsText;

    @FXML
    private Text golliwogsText1;

    @FXML
    private Text golliwogsText2;

    @FXML
    private Text sheriffsText;

    @FXML
    private Text sheriffsText1;

    @FXML
    private Text sheriffsText2;

    @FXML
    private Text soldiersText;

    @FXML
    private Text soldiersText1;

    @FXML
    private Text soldiersText2;

    @FXML
    private Text volatilesText;

    @FXML
    private Text volatilesText1;

    @FXML
    private Text volatilesText2;

    @FXML
    private Text zombiesText;

    @FXML
    private Text zombiesText1;

    @FXML
    private Text zombiesText2;

    @FXML
    void initialize() {
        List<Object> peacekeepersUnits = new ArrayList<>();
        List<Object> waterstationUnits = new ArrayList<>();
        List<Object> survivalsUnits = new ArrayList<>();
        Peacekeepers peacekeepers = new Peacekeepers(peacekeepersUnits);
        WaterStation waterStation = new WaterStation(waterstationUnits);
        Survivors survivors = new Survivors(survivalsUnits);

        setAmountOfUnitsText(peacekeepers, waterStation, survivors);

        clearPeacekeepers.setOnAction(actionEvent -> {
            peacekeepers.removeAllUnits();
            setAmountOfUnitsText(peacekeepers, waterStation, survivors);
        });

        clearWaterStation.setOnAction(actionEvent -> {
            waterStation.removeAllUnits();
            setAmountOfUnitsText(peacekeepers, waterStation, survivors);
        });

        clearSurvivors.setOnAction(actionEvent -> {
            survivors.removeAllUnits();
            setAmountOfUnitsText(peacekeepers, waterStation, survivors);
        });

        addUnit.setOnAction(actionEvent -> {
            Dialog<Pair<String, String>> dialog = new Dialog<>();
            dialog.setTitle("Додавання мікрооб'єкту");
            dialog.setHeaderText("Виберіть мікрооб'єкт який потрібно додати: ");

            ButtonType loginButtonType = new ButtonType("Add", ButtonBar.ButtonData.OK_DONE);
            dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

            GridPane grid = new GridPane();
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(20, 150, 10, 10));

            final ToggleGroup groupBase = new ToggleGroup();
            final ToggleGroup groupType = new ToggleGroup();
            RadioButton peacekeepersRadio = new RadioButton("Peacekeepers");
            RadioButton waterstationRadio = new RadioButton("WaterStation");
            RadioButton survivorsRadio = new RadioButton("Survivors");
            peacekeepersRadio.setSelected(true);
            peacekeepersRadio.setToggleGroup(groupBase);
            waterstationRadio.setToggleGroup(groupBase);
            survivorsRadio.setToggleGroup(groupBase);

            RadioButton addSoldier = new RadioButton("Soldier");
            RadioButton addCommander = new RadioButton("Commander");
            RadioButton addGeneral = new RadioButton("General");
            addSoldier.setSelected(true);
            addSoldier.setToggleGroup(groupType);
            addCommander.setToggleGroup(groupType);
            addGeneral.setToggleGroup(groupType);

            RadioButton addZombie = new RadioButton("Zombie");
            RadioButton addGolliwog = new RadioButton("Golliwog");
            RadioButton addVolatile = new RadioButton("Volatile");
            addZombie.setToggleGroup(groupType);
            addGolliwog.setToggleGroup(groupType);
            addVolatile.setToggleGroup(groupType);

            RadioButton addFighter = new RadioButton("Fighter");
            RadioButton addSheriff = new RadioButton("Sheriff");
            RadioButton addChief = new RadioButton("Chief");
            addFighter.setToggleGroup(groupType);
            addSheriff.setToggleGroup(groupType);
            addChief.setToggleGroup(groupType);

            grid.add(peacekeepersRadio, 0, 0);
            grid.add(waterstationRadio, 1, 0);
            grid.add(survivorsRadio, 2, 0);

            grid.add(addSoldier, 0, 1);
            grid.add(addCommander, 0, 2);
            grid.add(addGeneral, 0, 3);

            grid.add(addZombie, 1, 1);
            grid.add(addGolliwog, 1, 2);
            grid.add(addVolatile, 1, 3);

            grid.add(addFighter, 2, 1);
            grid.add(addSheriff, 2, 2);
            grid.add(addChief, 2, 3);

            dialog.getDialogPane().setContent(grid);

            Optional<Pair<String, String>> result = dialog.showAndWait();

            if (peacekeepersRadio.isSelected()) {
                if (addSoldier.isSelected()) {
                    peacekeepers.addUnit(new Soldier());
                }
                if (addCommander.isSelected()) {
                    peacekeepers.addUnit(new Commander());
                }
                if (addGeneral.isSelected()) {
                    peacekeepers.addUnit(new General());
                }
                if (addZombie.isSelected()) {
                    peacekeepers.addUnit(new Zombie());
                }
                if (addGolliwog.isSelected()) {
                    peacekeepers.addUnit(new Golliwog());
                }
                if (addVolatile.isSelected()) {
                    peacekeepers.addUnit(new Volatile());
                }
                if (addFighter.isSelected()) {
                    peacekeepers.addUnit(new Fighter());
                }
                if (addSheriff.isSelected()) {
                    peacekeepers.addUnit(new Sheriff());
                }
                if (addChief.isSelected()) {
                    peacekeepers.addUnit(new Chief());
                }
            }
            if (waterstationRadio.isSelected()) {
                if (addSoldier.isSelected()) {
                    waterStation.addUnit(new Soldier());
                }
                if (addCommander.isSelected()) {
                    waterStation.addUnit(new Commander());
                }
                if (addGeneral.isSelected()) {
                    waterStation.addUnit(new General());
                }
                if (addZombie.isSelected()) {
                    waterStation.addUnit(new Zombie());
                }
                if (addGolliwog.isSelected()) {
                    waterStation.addUnit(new Golliwog());
                }
                if (addVolatile.isSelected()) {
                    waterStation.addUnit(new Volatile());
                }
                if (addFighter.isSelected()) {
                    waterStation.addUnit(new Fighter());
                }
                if (addSheriff.isSelected()) {
                    waterStation.addUnit(new Sheriff());
                }
                if (addChief.isSelected()) {
                    waterStation.addUnit(new Chief());
                }
            }
            if (survivorsRadio.isSelected()) {
                if (addSoldier.isSelected()) {
                    survivors.addUnit(new Soldier());
                }
                if (addCommander.isSelected()) {
                    survivors.addUnit(new Commander());
                }
                if (addGeneral.isSelected()) {
                    survivors.addUnit(new General());
                }
                if (addZombie.isSelected()) {
                    survivors.addUnit(new Zombie());
                }
                if (addGolliwog.isSelected()) {
                    survivors.addUnit(new Golliwog());
                }
                if (addVolatile.isSelected()) {
                    survivors.addUnit(new Volatile());
                }
                if (addFighter.isSelected()) {
                    survivors.addUnit(new Fighter());
                }
                if (addSheriff.isSelected()) {
                    survivors.addUnit(new Sheriff());
                }
                if (addChief.isSelected()) {
                    survivors.addUnit(new Chief());
                }
            }
            setAmountOfUnitsText(peacekeepers, waterStation, survivors);
        });

    }

    private void setAmountOfUnitsText(Peacekeepers peacekeepers, WaterStation waterStation, Survivors survivors) {
        soldiersText.setText(String.valueOf(peacekeepers.getAmountOf("Soldier")));
        commandersText.setText(String.valueOf(peacekeepers.getAmountOf("Commander")));
        generalsText.setText(String.valueOf(peacekeepers.getAmountOf("General")));
        zombiesText.setText(String.valueOf(peacekeepers.getAmountOf("Zombie")));
        golliwogsText.setText(String.valueOf(peacekeepers.getAmountOf("Golliwog")));
        volatilesText.setText(String.valueOf(peacekeepers.getAmountOf("Volatile")));
        fightersText.setText(String.valueOf(peacekeepers.getAmountOf("Fighter")));
        sheriffsText.setText(String.valueOf(peacekeepers.getAmountOf("Sheriff")));
        chiefsText.setText(String.valueOf(peacekeepers.getAmountOf("Chief")));

        soldiersText1.setText(String.valueOf(waterStation.getAmountOf("Soldier")));
        commandersText1.setText(String.valueOf(waterStation.getAmountOf("Commander")));
        generalsText1.setText(String.valueOf(waterStation.getAmountOf("General")));
        zombiesText1.setText(String.valueOf(waterStation.getAmountOf("Zombie")));
        golliwogsText1.setText(String.valueOf(waterStation.getAmountOf("Golliwog")));
        volatilesText1.setText(String.valueOf(waterStation.getAmountOf("Volatile")));
        fightersText1.setText(String.valueOf(waterStation.getAmountOf("Fighter")));
        sheriffsText1.setText(String.valueOf(waterStation.getAmountOf("Sheriff")));
        chiefsText1.setText(String.valueOf(waterStation.getAmountOf("Chief")));

        soldiersText2.setText(String.valueOf(survivors.getAmountOf("Soldier")));
        commandersText2.setText(String.valueOf(survivors.getAmountOf("Commander")));
        generalsText2.setText(String.valueOf(survivors.getAmountOf("General")));
        zombiesText2.setText(String.valueOf(survivors.getAmountOf("Zombie")));
        golliwogsText2.setText(String.valueOf(survivors.getAmountOf("Golliwog")));
        volatilesText2.setText(String.valueOf(survivors.getAmountOf("Volatile")));
        fightersText2.setText(String.valueOf(survivors.getAmountOf("Fighter")));
        sheriffsText2.setText(String.valueOf(survivors.getAmountOf("Sheriff")));
        chiefsText2.setText(String.valueOf(survivors.getAmountOf("Chief")));
    }
}