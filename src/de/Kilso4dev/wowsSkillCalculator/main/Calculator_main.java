package de.Kilso4dev.wowsSkillCalculator.main;

import de.Kilso4dev.wowsSkillCalculator.windowComponents.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Calculator_main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setTitle("World of Warships Tech-Tree and Calculator");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setBounds((int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) - 1600 )/2,(int)( Toolkit.getDefaultToolkit().getScreenSize().getHeight() -900) /2, 1600, 900);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);
    }
}
