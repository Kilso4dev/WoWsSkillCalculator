package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private Container cMainWindow;
    private JPanel chooseNationPanel;
    private JRadioButton[] chooseNation = new JRadioButton[11];
    private ButtonGroup buttons;
    private JButton skillButton;
    private JButton moduleButton;
    private TechTreePanel[] nationPanels = new TechTreePanel[11];


    public MainWindow() {
        cMainWindow = getContentPane();
        cMainWindow.setLayout(null);
        createChooseNationPanel();
        createSkillButton();
        createModuleButton();
        createNationPanels();



    }

    private void createNationPanels() {
        nationPanels[0] = new TechTreePanel("Arpeggio");
        nationPanels[1] = new TechTreePanel("Japan");
        nationPanels[2] = new TechTreePanel("USA");
        nationPanels[3] = new TechTreePanel("USSR");
        nationPanels[4] = new TechTreePanel("KM");
        nationPanels[5] = new TechTreePanel("UK");
        nationPanels[6] = new TechTreePanel("Poland");
        nationPanels[7] = new TechTreePanel("Asia");
        nationPanels[8] = new TechTreePanel("France");
        nationPanels[9] = new TechTreePanel("Italy");
        nationPanels[10] = new TechTreePanel("Commonwealth");

        for (TechTreePanel value1 : nationPanels) {
            if (value1.getNation().equals("Arpeggio")) {
                value1.setVisible(true);
            } else {
                value1.setVisible(false);
            }
            value1.setBounds(200, 50, 1000, 650);
            cMainWindow.add(value1);
        }
    }

    private void createModuleButton() {
        moduleButton = new JButton("Show all Modules");
        moduleButton.setBounds(50, 400, 169, 49);
        moduleButton.addActionListener(new ButtonListener());
        moduleButton.setVisible(true);
        cMainWindow.add(moduleButton);
    }

    private void createSkillButton() {
        skillButton = new JButton("Show Captain Skills");
        skillButton.setLocation(50, 370);
        skillButton.addActionListener(new ButtonListener());
        skillButton.setVisible(true);
        cMainWindow.add(skillButton);
    }

    private void createChooseNationPanel() {
        chooseNation[0] = new JRadioButton("Arpeggio");
        chooseNation[1] = new JRadioButton("Japan");
        chooseNation[2] = new JRadioButton("U.S.A.");
        chooseNation[3] = new JRadioButton("U.S.S.R.");
        chooseNation[4] = new JRadioButton("Germany");
        chooseNation[5] = new JRadioButton("U.K.");
        chooseNation[6] = new JRadioButton("Poland");
        chooseNation[7] = new JRadioButton("Pan-Asia");
        chooseNation[8] = new JRadioButton("France");
        chooseNation[9] = new JRadioButton("Italy");
        chooseNation[10] = new JRadioButton("Commonwealth");
        chooseNation[0].setSelected(true);

        chooseNationPanel = new JPanel(new GridLayout(11, 1));
        chooseNationPanel.setLocation(50 , 50);
        buttons = new ButtonGroup();

        for (JRadioButton value1 : chooseNation) {
            buttons.add(value1);
            chooseNationPanel.add(value1);
        }
        chooseNationPanel.setVisible(true);
        cMainWindow.add(chooseNationPanel);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(moduleButton)) {
                new ModuleWindow();
            } else if (e.getSource().equals(skillButton)) {
                new CaptainSkillWindow();
            }
        }
    }
}