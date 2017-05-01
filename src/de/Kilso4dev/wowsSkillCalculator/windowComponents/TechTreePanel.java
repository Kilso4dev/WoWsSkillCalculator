package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;

class TechTreePanel extends JPanel {

    private String nation = "";
    private final Font fNormal = new Font("Times New Roman", 0, 16);
    private final Font fHeadline = new Font("Times New Roman", Font.BOLD, 17);

    TechTreePanel(String nation){
        this(null, nation);
    }
    
    TechTreePanel(JComponent src, String nation) {
        src = (src == null) ? this : src;

        //System.out.println("Hallo mein Name ist: " + ((src == null ? "Paul" : "Robert")));

        setNation(nation);
        src.setLayout(new GridLayout(11, 3));
        src.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

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
        for (Component cComponent : src.getComponents()) {
            if (cComponent instanceof ClickLabel) {
                cComponent.setFont(fNormal);
            } else {
                cComponent.setFont(fHeadline);
            }
        }
    }

    private void createArpeggio(JComponent src) {
        src.add(new JLabel("Arpeggio"));
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
        src.add(new ClickLabel("ARP Kongō, BB"));
        src.add(new ClickLabel("ARP Kirishima, BB"));
        src.add(new ClickLabel("ARP Haruna, BB"));
        src.add(new ClickLabel("ARP Hiei, BB"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VI"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("ARP Myōkō, CA"));
        src.add(new ClickLabel("ARP Haguro, CA"));
        src.add(new ClickLabel("ARP Ashigara, CA"));
        src.add(new ClickLabel("ARP Nachi, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("ARP Takao, CA"));
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
        src.add(new JLabel());

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Hashidate"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Chikuma"));
        src.add(new ClickLabel("Umikaze"));
        src.add(new JLabel());
        src.add(new ClickLabel("Tachibana, DD"));
        src.add(new ClickLabel("Tachibana L, DD"));
        src.add(new ClickLabel("Mikasa, BB"));
        src.add(new JLabel());

        src.add(new JLabel("Tier III"));
        src.add(new JLabel());
        src.add(new ClickLabel("Kawachi"));
        src.add(new ClickLabel("Tenryū"));
        src.add(new ClickLabel("Wakatake"));
        src.add(new JLabel());
        src.add(new ClickLabel("Katori, CA"));
        createMultipleLabels(src, 3, "");

        src.add(new JLabel("Tier IV"));
        src.add(new ClickLabel("Hōshō"));
        src.add(new ClickLabel("Myōgi"));
        src.add(new ClickLabel("Kuma"));
        src.add(new ClickLabel("Isokaze"));
        src.add(new JLabel());
        src.add(new ClickLabel("Ishizuchi, BB"));
        src.add(new ClickLabel("Yūbari, CA"));
        src.add(new ClickLabel("Iwaki A, CA"));
        src.add(new JLabel());

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("Zuihō"));
        src.add(new ClickLabel("Kongō"));
        src.add(new ClickLabel("Furutaka"));
        src.add(new ClickLabel("Mutsuki"));
        src.add(new ClickLabel("Minekaze"));
        src.add(new ClickLabel("Kamikaze, DD"));
        src.add(new ClickLabel("Kamikaze R, DD"));
        src.add(new ClickLabel("Fūjin, DD"));
        src.add(new JLabel());

        src.add(new JLabel("Tier VI"));
        src.add(new ClickLabel("Ryūjō"));
        src.add(new ClickLabel("Fusō"));
        src.add(new ClickLabel("Aoba"));
        src.add(new ClickLabel("Fubuki"));
        src.add(new ClickLabel("Hatsuharu"));
        src.add(new ClickLabel("Shinonome, CA"));
        src.add(new ClickLabel("Mutsu, BB"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("Hiryū"));
        src.add(new ClickLabel("Nagato"));
        src.add(new ClickLabel("Myōkō"));
        src.add(new ClickLabel("Akatsuki"));
        src.add(new ClickLabel("Shiratsuyu"));
        src.add(new ClickLabel("Kaga, CV"));
        src.add(new ClickLabel("S. Dragon, CA"));
        src.add(new ClickLabel("E. Dragon, CA"));
        src.add(new JLabel());

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("Shōkaku"));
        src.add(new ClickLabel("Amagi"));
        src.add(new ClickLabel("Mogami"));
        src.add(new ClickLabel("Kagerō"));
        src.add(new ClickLabel("Akizuki"));
        src.add(new ClickLabel("Atago, CA"));
        src.add(new ClickLabel("(Kitakami, CA)"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier IX"));
        src.add(new ClickLabel("Taihō"));
        src.add(new ClickLabel("Izumo"));
        src.add(new ClickLabel("Ibuki"));
        src.add(new ClickLabel("Yugumo"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier X"));
        src.add(new ClickLabel("Hakuryū"));
        src.add(new ClickLabel("Yamato"));
        src.add(new ClickLabel("Zao"));
        src.add(new ClickLabel("Shimakaze"));
    }

    private void createUSA(JComponent src) {
        src.add(new JLabel("U.S.A."));
        src.add(new JLabel("Aircraft Carrier"));
        src.add(new JLabel("Battleship"));
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Destroyer"));
        createMultipleLabels(src, 5, "Premium");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Erie"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Chester"));
        src.add(new ClickLabel("Sampson"));
        src.add(new ClickLabel("Albany, CA"));
        src.add(new ClickLabel("Smith, DD"));
        createMultipleLabels(src, 3, "");

        src.add(new JLabel("Tier III"));
        src.add(new JLabel());
        src.add(new ClickLabel("South Carolina"));
        src.add(new ClickLabel("St. Louis"));
        src.add(new ClickLabel("Wickes"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier IV"));
        src.add(new ClickLabel("Langley"));
        src.add(new ClickLabel("Wyoming"));
        src.add(new ClickLabel("Phoenix"));
        src.add(new ClickLabel("Clemson"));
        src.add(new ClickLabel("Arkansas B, BB"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("Bogue"));
        src.add(new ClickLabel("New York"));
        src.add(new ClickLabel("Omaha"));
        src.add(new ClickLabel("Nicholas"));
        src.add(new ClickLabel("Marblehead, CA"));
        src.add(new ClickLabel("Marblehead L, CA"));
        src.add(new ClickLabel("Texas, BB"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier VI"));
        src.add(new ClickLabel("Independence"));
        src.add(new ClickLabel("New Mexico"));
        src.add(new ClickLabel("Cleveland"));
        src.add(new ClickLabel("Farragut"));
        src.add(new ClickLabel("Arizona, BB"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("Ranger"));
        src.add(new ClickLabel("Colorado"));
        src.add(new ClickLabel("Pensacola"));
        src.add(new ClickLabel("Mahan"));
        src.add(new ClickLabel("Atlanta, Ca"));
        src.add(new ClickLabel("Sims, DD"));
        src.add(new ClickLabel("Saipan, CV"));
        src.add(new ClickLabel("Indiapolis, CA"));
        src.add(new ClickLabel("Flint, CA"));

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("Lexington"));
        src.add(new ClickLabel("North Carolina"));
        src.add(new ClickLabel("New Orleans"));
        src.add(new ClickLabel("Benson"));
        src.add(new ClickLabel("Alabama, BB"));
        src.add(new ClickLabel("Alabama ST, BB"));
        createMultipleLabels(src, 3, "");

        src.add(new JLabel("Tier IX"));
        src.add(new ClickLabel("Essex"));
        src.add(new ClickLabel("Iowa"));
        src.add(new ClickLabel("Baltimore"));
        src.add(new ClickLabel("Fletcher"));
        src.add(new ClickLabel("Missouri, BB"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier X"));
        src.add(new ClickLabel("Midway"));
        src.add(new ClickLabel("Montana"));
        src.add(new ClickLabel("Des Moines"));
        src.add(new ClickLabel("Gearing"));
    }

    private void createUSSR(JComponent src) {
        src.add(new JLabel("U.S.S.R."));
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Destroyer"));
        src.add(new JLabel("Destroyer"));
        createMultipleLabels(src, 4, "Premium");
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier I"));
        src.add(new ClickLabel("Orlan"));
        createMultipleLabels(src, 8, "");

        src.add(new JLabel("Tier II"));
        src.add(new ClickLabel("Novik"));
        src.add(new ClickLabel("Storozhevoi"));
        src.add(new JLabel());
        src.add(new ClickLabel("Diana, CA"));
        src.add(new ClickLabel("Diana L, CA"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier III"));
        src.add(new ClickLabel("Bogatyr"));
        src.add(new ClickLabel("Derzki"));
        src.add(new JLabel());
        src.add(new ClickLabel("Aurora, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier IV"));
        src.add(new ClickLabel("Svietlana"));
        src.add(new ClickLabel("Izyaslav"));
        src.add(new JLabel());
        src.add(new ClickLabel("Imperator Nikolai I BB"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("Kirov"));
        src.add(new ClickLabel("Podvoisky"));
        src.add(new JLabel());
        src.add(new ClickLabel("Murmansk, CA"));
        src.add(new ClickLabel("Gremyashchy, DD"));
        src.add(new ClickLabel("Krasny Krym, CA"));
        src.add(new ClickLabel("Okhotnik, DD"));
        createMultipleLabels(src, 2, "");

        src.add(new JLabel("Tier VI"));
        src.add(new ClickLabel("Budyonny"));
        src.add(new ClickLabel("Gnevny"));
        src.add(new JLabel());
        src.add(new ClickLabel("Molotov, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("Shchors"));
        src.add(new ClickLabel("Minsk"));
        src.add(new JLabel());
        src.add(new ClickLabel("Leningrad, DD"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("Chapayev"));
        src.add(new ClickLabel("Kiev"));
        src.add(new ClickLabel("Ognevoi"));
        src.add(new ClickLabel("Mikhail Kutuzov, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier IX"));
        src.add(new ClickLabel("Dmitri Donskoi"));
        src.add(new ClickLabel("Tashkent"));
        src.add(new ClickLabel("Udaloi"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier X"));
        src.add(new ClickLabel("Moskva"));
        src.add(new ClickLabel("Khabarovsk"));
        src.add(new ClickLabel("Grozovoy"));
    }

    private void createKM(JComponent src) {
        src.add(new JLabel("Germany"));
        src.add(new JLabel("Battleship"));
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Destroyer"));
        createMultipleLabels(src, 2, "Premium");
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier I"));
        src.add(new JLabel());
        src.add(new ClickLabel("Hermelin"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier II"));
        src.add(new JLabel());
        src.add(new ClickLabel("Dresden"));
        src.add(new ClickLabel("V-25"));
        src.add(new ClickLabel("Emden, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier III"));
        src.add(new ClickLabel("Nassau"));
        src.add(new ClickLabel("Kolberg"));
        src.add(new ClickLabel("G-101"));
        src.add(new ClickLabel("König Albert, BB"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier IV"));
        src.add(new ClickLabel("Kaiser"));
        src.add(new ClickLabel("Karlsruhe"));
        src.add(new ClickLabel("V-170"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier V"));
        src.add(new ClickLabel("König"));
        src.add(new ClickLabel("Königsberg"));
        src.add(new ClickLabel("T-22"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier VI"));
        src.add(new ClickLabel("Bayern"));
        src.add(new ClickLabel("Nürnberg"));
        src.add(new ClickLabel("Ernst Gaede"));
        src.add(new ClickLabel("Graaf Spee, CA"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VII"));
        src.add(new ClickLabel("Gneisenau"));
        src.add(new ClickLabel("Yorck"));
        src.add(new ClickLabel("Leberecht Maass"));
        src.add(new ClickLabel("Scharnhorst, BB"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new ClickLabel("Bismarck"));
        src.add(new ClickLabel("Admiral Hipper"));
        src.add(new ClickLabel("Z-23"));
        src.add(new ClickLabel("Tirpitz, BB"));
        src.add(new ClickLabel("Prinz Eugen, CA"));
        createMultipleLabels(src, 4, "");

        src.add(new JLabel("Tier IX"));
        src.add(new ClickLabel("Friedrich der Große"));
        src.add(new ClickLabel("Roon"));
        src.add(new ClickLabel("Z-46"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier X"));
        src.add(new ClickLabel("Großer Kurfürst"));
        src.add(new ClickLabel("Hindenburg"));
        src.add(new ClickLabel("Z-52"));
    }

    private void createUK(JComponent src) {
        src.add(new JLabel("U.K."));
        src.add(new JLabel());
        src.add(new JLabel("Cruiser"));
        createMultipleLabels(src, 2, "Premium");
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier I"));
        src.add(new JLabel());
        src.add(new ClickLabel("Black Swan"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier II"));
        src.add(new JLabel());
        src.add(new ClickLabel("Weymouth"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier III"));
        src.add(new JLabel());
        src.add(new ClickLabel("Caledon"));
        src.add(new ClickLabel("Campbeltown, DD"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier IV"));
        src.add(new JLabel());
        src.add(new ClickLabel("Danae"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier V"));
        src.add(new JLabel());
        src.add(new ClickLabel("Emerald"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VI"));
        src.add(new JLabel());
        src.add(new ClickLabel("Leander"));
        src.add(new ClickLabel("Warspite, BB"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier VII"));
        src.add(new JLabel());
        src.add(new ClickLabel("Fiji"));
        src.add(new ClickLabel("Belfast, CA"));
        src.add(new ClickLabel("Hood, BB"));
        createMultipleLabels(src, 5, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new JLabel());
        src.add(new ClickLabel("Edinburgh"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier IX"));
        src.add(new JLabel());
        src.add(new ClickLabel("Neptune"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier X"));
        src.add(new JLabel());
        src.add(new ClickLabel("Minotaur"));
    }

    private void createPoland(JComponent src) {
        src.add(new JLabel("Poland"));
        src.add(new JLabel());
        src.add(new JLabel("Premium"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VI"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VII"));
        src.add(new JLabel());
        src.add(new ClickLabel("Błyskawica, DD"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VIII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
    }

    private void createAsia(JComponent src) {
        src.add(new JLabel("China/Taiwan"));
        src.add(new JLabel());
        createMultipleLabels(src, 2, "Premium");
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VI"));
        src.add(new JLabel());
        src.add(new ClickLabel("Anshan, DD"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VII"));
        createMultipleLabels(src, 2, "");
        src.add(new ClickLabel("Lo Yang, DD"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier VIII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
    }

    private void createFrance(JComponent src) {
        src.add(new JLabel("France"));
        src.add(new JLabel());
        src.add(new JLabel("Cruiser"));
        src.add(new JLabel("Premium"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier I"));
        src.add(new JLabel());
        src.add(new ClickLabel("Bougainville"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier II"));
        src.add(new JLabel());
        src.add(new ClickLabel("Jurien De La Gravière"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier III"));
        src.add(new JLabel());
        src.add(new ClickLabel("Fraint"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier IV"));
        src.add(new JLabel());
        src.add(new ClickLabel("Duguay-Trouin"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier V"));
        src.add(new JLabel());
        src.add(new ClickLabel("Émile Bertin"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VI"));
        src.add(new JLabel());
        src.add(new ClickLabel("La Galissonnière"));
        src.add(new ClickLabel("Dunkerque, DD"));
        createMultipleLabels(src, 6, "");

        src.add(new JLabel("Tier VII"));
        src.add(new JLabel());
        src.add(new ClickLabel("Algérie"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VIII"));
        src.add(new JLabel());
        src.add(new ClickLabel("Charles Martel"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier IX"));
        src.add(new JLabel());
        src.add(new ClickLabel("Saint-Louis"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier X"));
        src.add(new JLabel());
        src.add(new ClickLabel("Henri IV"));
    }

    private void createItaly(JComponent src) {
        src.add(new JLabel("Italy"));
        src.add(new JLabel());
        src.add(new JLabel("Premium"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VI"));
        src.add(new JLabel());
        src.add(new ClickLabel("Duca D'Aosta, CA"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VIII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
    }

    private void createCommonwealth(JComponent src) {
        src.add(new JLabel("Commonwealth"));
        src.add(new JLabel());
        src.add(new JLabel("Premium"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier I"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier II"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier III"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IV"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier V"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VI"));
        src.add(new JLabel());
        src.add(new ClickLabel("Perth, CA"));
        createMultipleLabels(src, 7, "");

        src.add(new JLabel("Tier VII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier VIII"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier IX"));
        createMultipleLabels(src, 9, "");

        src.add(new JLabel("Tier X"));
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