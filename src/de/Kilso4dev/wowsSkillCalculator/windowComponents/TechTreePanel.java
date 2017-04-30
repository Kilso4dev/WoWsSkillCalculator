package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fAll = new Font("Times New Roman", Font.BOLD, 20);

    TechTreePanel(String nation){
        this.nation = nation;
        this.setLayout(new GridLayout(11, 10, 30, 50));

        /*this.add(new JLabel(""));
        this.add(new JLabel("Tier I"));
        this.add(new JLabel("Tier II"));
        this.add(new JLabel("Tier III"));
        this.add(new JLabel("Tier IV"));
        this.add(new JLabel("Tier V"));
        this.add(new JLabel("Tier VI"));
        this.add(new JLabel("Tier VII"));
        this.add(new JLabel("Tier VIII"));
        this.add(new JLabel("Tier IX"));
        this.add(new JLabel("Tier X"));
        for (int i = 0; i < 110; i ++) {
            this.add(new JLabel("Nummer " + i ));
        } */

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
        this.add(new JLabel(""));
        createMultipleLabels(4, "Premium");
        createMultipleLabels(4, "");
        this.add(new JLabel("Tier I"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier II"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier III"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier IV"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier V"));
        this.add(new JLabel("ARP Kongo"));
        this.add(new JLabel("ARP Kirishima"));
        this.add(new JLabel("ARP Haruna"));
        this.add(new JLabel("ARP Hiei"));
        createMultipleLabels(4, "");
        this.add(new JLabel("Tier VI"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier VII"));
        this.add(new JLabel("ARP Myoko"));
        this.add(new JLabel("ARP Haguro"));
        this.add(new JLabel("ARP Ashigara"));
        this.add(new JLabel("ARP Nachi"));
        createMultipleLabels(4, "");
        this.add(new JLabel("Tier VI"));
        this.add(new JLabel("ARP Takao"));
        createMultipleLabels(8, "");
        this.add(new JLabel("Tier VIII"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier IX"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier X"));
        createMultipleLabels(9, "");
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

    private void createMultipleLabels(int i, String s) {
        for (int j = 0; j < i; j ++) {
            this.add(new JLabel(s));
        }
    }

    public String getNation() {
        return nation;
    }
}