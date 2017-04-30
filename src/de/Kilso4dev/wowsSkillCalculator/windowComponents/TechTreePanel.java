package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fAll = new Font("Times New Roman", Font.BOLD, 30);

    TechTreePanel(String nation){
        this.nation = nation;

        if (nation.equals("Arpeggio")) {
            createArpeggio();
        } else if (nation.equals("Japan")) {
            createJapan();
        } else if (nation.equals("USA")) {
            createUSA();
        } else if (nation.equals("USSR")) {
            createUSSR();
        } else if (nation.equals("KM")) {
            createKM();
        } else if (nation.equals("UK")) {
            createUK();
        } else if (nation.equals("Poland")) {
            createPoland();
        } else if (nation.equals("Asia")) {
            createAsia();
        } else if (nation.equals("France")) {
            createFrance();
        } else if (nation.equals("Italy")) {
            createItaly();
        } else if (nation.equals("Commonwealth")) {
            createCommonwealth();
        }
        for (Component cComponent : this.getComponents()) {
            cComponent.setFont(fAll);
        }
    }

    private void createArpeggio() {

    }

    private void createJapan() {

    }

    private void createUSA() {

    }

    private void createUSSR() {

    }

    private void createKM() {

    }

    private void createUK() {

    }

    private void createPoland() {

    }

    private void createAsia() {

    }

    private void createFrance() {

    }

    private void createItaly() {

    }

    private void createCommonwealth() {

    }

    private void createEmptyLabels(int i) {
        for (int j = 0; j < i; j ++) {
            this.add(new JLabel(""));
        }
    }

    public String getNation() {
        return nation;
    }
}