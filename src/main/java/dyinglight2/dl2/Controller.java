package dyinglight2.dl2;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton addChief;

    @FXML
    private RadioButton addCommander;

    @FXML
    private RadioButton addFighter;

    @FXML
    private RadioButton addGeneral;

    @FXML
    private RadioButton addGolliwog;

    @FXML
    private RadioButton addSheriff;

    @FXML
    private RadioButton addSoldier;

    @FXML
    private Button addUnit;

    @FXML
    private RadioButton addVolatile;

    @FXML
    private RadioButton addZombie;

    @FXML
    private Text chiefsText;

    @FXML
    private Text chiefsText1;

    @FXML
    private Text chiefsText2;

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
    private ToggleGroup group;

    @FXML
    private ToggleGroup group2;

    @FXML
    private RadioButton peacekeepersRadio;

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
    private RadioButton survivorsRadio;

    @FXML
    private Text volatilesText;

    @FXML
    private Text volatilesText1;

    @FXML
    private Text volatilesText2;

    @FXML
    private DialogPane window;

    @FXML
    private RadioButton waterstationRadio;

    @FXML
    private Text zombiesText;

    @FXML
    private Text zombiesText1;

    @FXML
    private Text zombiesText2;

    @FXML
    void F3(KeyEvent event) throws InterruptedException {
window.getContent();
    }

    @FXML
    void initialize() {
        List<Object> peacekeepersUnits = new ArrayList<>();
        List<Object> waterstationUnits = new ArrayList<>();
        List<Object> survivalsUnits = new ArrayList<>();
        Peacekeepers peacekeepers = new Peacekeepers(peacekeepersUnits);
        WaterStation waterStation = new WaterStation(waterstationUnits);
        Survivors survivors = new Survivors(survivalsUnits);

        addUnit.setOnAction(actionEvent -> {
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
        });

    }

}