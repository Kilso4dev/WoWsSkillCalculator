package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fAll = new Font("Times New Roman", Font.BOLD, 15);

    TechTreePanel(String nation){
        this(null, nation);
    }
    
    TechTreePanel(JComponent src, String nation) {
        src = (src == null) ? this : src;

        //System.out.println("Hallo mein Name ist: " + ((src == null ? "Paul" : "Robert")));

        setNation(nation);
        this.setLayout(new GridLayout(10, 1));

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
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("ARP Kongo, BB"));
        src.add(new ClickLabel("ARP Kirishima, BB"));
        src.add(new ClickLabel("ARP Haruna, BB"));
        src.add(new ClickLabel("ARP Hiei, BB"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VI"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("ARP Myoko, CA"));
        src.add(new ClickLabel("ARP Haguro, CA"));
        src.add(new ClickLabel("ARP Ashigara, CA"));
        src.add(new ClickLabel("ARP Nachi, CA"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("ARP Takao, CA"));
        createMultipleLabels(src, 10, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 11, "");

        src.add(new JLabel("Tier X"));
    }

    private void createJapan(JComponent src) {
        src.add(new JLabel("Japan"));
        src.add(new JLabel("Aircraft Carrier"));
        src.add(new JLabel("Battleship"));
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Destroyer"));
        src.add(new JLabel("Destroyer"));
        createMultipleLabels(src, 4, "Premium");
        src.add(new JLabel());

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Hashidate"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Chikuma"));
        src.add(new ClickLabel("Umikaze"));
        src.add(new JLabel());
        src.add(new ClickLabel("Tachibana, DD"));
        src.add(new ClickLabel("Tachibana L, DD"));
        src.add(new ClickLabel("Mikasa, BB"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier III"));
        src.add(new JLabel());
        src.add(new JLabel("Kawachi"));
        src.add(new JLabel("Tenryu"));
        src.add(new JLabel("Wakatake"));
        src.add(new JLabel());
        src.add(new JLabel("Katori, CA"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier IV"));
        src.add(new ClickLabel("Hosho"));
        src.add(new ClickLabel("Myogi"));
        src.add(new ClickLabel("Kuma"));
        src.add(new ClickLabel("Isokaze"));
        src.add(new JLabel());
        src.add(new ClickLabel("Ishizuchi, BB"));
        src.add(new ClickLabel("Yubari, CA"));
        src.add(new ClickLabel("Iwaki A, CA"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("Zuiho"));
        src.add(new ClickLabel("Kongo"));
        src.add(new ClickLabel("Furutaka"));
        src.add(new ClickLabel("Mutsuki"));
        src.add(new ClickLabel("Minekaze"));
        src.add(new ClickLabel("Kamikaze, DD"));
        src.add(new ClickLabel("Kamikaze R, DD"));
        src.add(new ClickLabel("Fujin, DD"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier VI"));
        src.add(new ClickLabel("Ryujo"));
        src.add(new ClickLabel("Fuso"));
        src.add(new ClickLabel("Aoba"));
        src.add(new ClickLabel("Fubuki"));
        src.add(new ClickLabel("Hatsuharu"));
        src.add(new ClickLabel("Shinonome, CA"));
        src.add(new ClickLabel("Mutsu, BB"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("Hiryu"));
        src.add(new ClickLabel("Nagato"));
        src.add(new ClickLabel("Myoko"));
        src.add(new ClickLabel("Akatsuki"));
        src.add(new ClickLabel("Shiratsuyu"));
        src.add(new ClickLabel("Kaga, CV"));
        src.add(new ClickLabel("S. Dragon, CA"));
        src.add(new ClickLabel("E. Dragon, CA"));
        src.add(new JLabel());

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("Shokaku"));
        src.add(new ClickLabel("Amagi"));
        src.add(new ClickLabel("Mogami"));
        src.add(new ClickLabel("Kagero"));
        src.add(new ClickLabel("Akizuki"));
        src.add(new ClickLabel("Atago, CA"));
        src.add(new ClickLabel("(Kitakami, CA)"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier IX"));
        src.add(new ClickLabel("Taiho"));
        src.add(new ClickLabel("Izumo"));
        src.add(new ClickLabel("Ibuki"));
        src.add(new ClickLabel("Yugumo"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier X"));
        src.add(new ClickLabel("Hakuryu"));
        src.add(new ClickLabel("Yamato"));
        src.add(new ClickLabel("Zao"));
        src.add(new ClickLabel("Shimakaze"));
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