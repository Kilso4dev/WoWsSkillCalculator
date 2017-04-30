package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fAll = new Font("Times New Roman", Font.BOLD, 20);

    TechTreePanel(String nation){
        this(nation, );
    }
    
    TechTreePanel(String nation, JComponent src) {
        setNation(nation);
        this.setLayout(new GridLayout(11, 10, 30, 50));

        if (nation.equals("Arpeggio")) {
            createArpeggio(src);
        } else if (nation.equals("Japan")) {
            createJapan(src);
        } else if (nation.equals("USA")) {
            createUSA(src);
        } else if (nation.equals("USSR")) {
            createUSSR(src);
        } else if (nation.equals("KM")) {
            createKM(src);
        } else if (nation.equals("UK")) {
            createUK(src);
        } else if (nation.equals("Poland")) {
            createPoland(src);
        } else if (nation.equals("Asia")) {
            createAsia(src);
        } else if (nation.equals("France")) {
            createFrance(src);
        } else if (nation.equals("Italy")) {
            createItaly(src);
        } else if (nation.equals("Commonwealth")) {
            createCommonwealth(src);
        }
        for (Component cComponent : this.getComponents()) {
            cComponent.setFont(fAll);
        }
    }
        

    private void createArpeggio(JComponent src) {
        src.add(new JLabel("ARP"));
        createMultipleLabels(src, 4, "Premium");
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("ARP Kongo"));
        src.add(new ClickLabel("ARP Kirishima"));
        src.add(new ClickLabel("ARP Haruna"));
        src.add(new ClickLabel("ARP Hiei"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VI"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("ARP Myoko"));
        src.add(new ClickLabel("ARP Haguro"));
        src.add(new ClickLabel("ARP Ashigara"));
        src.add(new ClickLabel("ARP Nachi"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("ARP Takao"));
        createMultipleLabels(src, 8, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
    }

    private void createJapan(JComponent src) {
        src.add(new JLabel("Japan"));
        src.add(new JLabel("Aircraft Carrier"));
        src.add(new JLabel("Battleship"));
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Destroyer"));
        src.add(new JLabel("Destroyer"));
        createMultipleLabels(src, 3, "Premium");
        src.add(new JLabel(""));

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Hashidate"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Chikuma"));
        src.add(new ClickLabel("Umikaze"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        //src.add(new JLabel("ARP Kongo"));
        //src.add(new JLabel("ARP Kirishima"));
        //src.add(new JLabel("ARP Haruna"));
        //src.add(new JLabel("ARP Hiei"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VI"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VII"));
        //src.add(new JLabel("ARP Myoko"));
        //src.add(new JLabel("ARP Haguro"));
        //src.add(new JLabel("ARP Ashigara"));
        //src.add(new JLabel("ARP Nachi"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        //src.add(new JLabel("ARP Takao"));
        createMultipleLabels(src, 8, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
    }

    private void createUSA(JComponent src) {

    }

    private void createUSSR(JComponent src) {

    }

    private void createKM(JComponent src) {

    }

    private void createUK(JComponent src) {

    }

    private void createPoland(JComponent src) {

    }

    private void createAsia(JComponent src) {

    }

    private void createFrance(JComponent src) {

    }

    private void createItaly(JComponent src) {

    }

    private void createCommonwealth(JComponent src) {

    }

    private void createMultipleLabels(JComponent src, int i, String s) {
        for (int j = 0; j < i; j ++) {
            src.add(new JLabel(s));
        }
    }

    String getNation() {
        return nation;
    }

    private void setNation(String nation) {
        this.nation = nation;
    }
}