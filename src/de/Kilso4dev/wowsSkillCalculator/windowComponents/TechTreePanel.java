package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fAll = new Font("Times New Roman", Font.BOLD, 20);

    TechTreePanel(String nation){
        this.nation = nation;
        this.setLayout(new GridLayout(11, 10, 30, 50));

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
        createMultipleLabels(5, "");
        this.add(new JLabel("Tier I"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier II"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier III"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier IV"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier V"));
        this.add(new ClickLabel("ARP Kongo"));
        this.add(new ClickLabel("ARP Kirishima"));
        this.add(new ClickLabel("ARP Haruna"));
        this.add(new ClickLabel("ARP Hiei"));
        createMultipleLabels(5, "");
        this.add(new JLabel("Tier VI"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier VII"));
        this.add(new ClickLabel("ARP Myoko"));
        this.add(new ClickLabel("ARP Haguro"));
        this.add(new ClickLabel("ARP Ashigara"));
        this.add(new ClickLabel("ARP Nachi"));
        createMultipleLabels(5, "");
        this.add(new JLabel("Tier VIII"));
        this.add(new ClickLabel("ARP Takao"));
        createMultipleLabels(8, "");
        this.add(new JLabel("Tier IX"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier X"));
    }

    private void createJapan() {
        this.add(new JLabel(""));
        this.add(new JLabel("Aircraft Carrier"));
        this.add(new JLabel("Battleship"));
        this.add(new JLabel("Cruiser"));
        this.add(new JLabel("Destroyer"));
        this.add(new JLabel("Destroyer"));
        createMultipleLabels(3, "Premium");
        this.add(new JLabel(""));
        this.add(new JLabel("Tier I"));
        createMultipleLabels(2, "");
        this.add(new ClickLabel("Hashidate"));
        createMultipleLabels(6, "");
        this.add(new JLabel("Tier II"));
        createMultipleLabels(2, "");
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier III"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier IV"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier V"));
        //this.add(new JLabel("ARP Kongo"));
        //this.add(new JLabel("ARP Kirishima"));
        //this.add(new JLabel("ARP Haruna"));
        //this.add(new JLabel("ARP Hiei"));
        createMultipleLabels(5, "");
        this.add(new JLabel("Tier VI"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier VII"));
        //this.add(new JLabel("ARP Myoko"));
        //this.add(new JLabel("ARP Haguro"));
        //this.add(new JLabel("ARP Ashigara"));
        //this.add(new JLabel("ARP Nachi"));
        createMultipleLabels(5, "");
        this.add(new JLabel("Tier VIII"));
        //this.add(new JLabel("ARP Takao"));
        createMultipleLabels(8, "");
        this.add(new JLabel("Tier IX"));
        createMultipleLabels(9, "");
        this.add(new JLabel("Tier X"));
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