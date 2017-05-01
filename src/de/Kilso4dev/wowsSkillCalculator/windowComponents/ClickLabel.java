package de.Kilso4dev.wowsSkillCalculator.windowComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;

class ClickLabel extends JLabel {

    private HashSet<ActionListener> aListener = new HashSet<>();
    private String actionCommand;

    public ClickLabel() {
        super();
    }

    public ClickLabel(String text) {
        super(text);
    }

    public ClickLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public ClickLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public ClickLabel(Icon icon, int horizontalAlignment) {
        super(icon, horizontalAlignment);
    }

    public ClickLabel(Icon icon) {
        super(icon);
    }


    public void addActionListener(ActionListener l) {
        aListener.add(l);
        super.addMouseListener(new MouseListener());
    }


    //getter and setter
    public void setActionCommand(String command) {
        this.actionCommand = command;
    }

    public String getActionCommand() {
        return this.actionCommand;
    }





    //inner MouseListener Class
    private class MouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent me) {
            setBackground(getBackground().darker());
        }

        @Override
        public void mouseExited(MouseEvent me) {
            setBackground(getBackground().brighter());
        }

        @Override
        public void mousePressed(MouseEvent me) {
            setBackground(getBackground().darker());
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            setBackground(getBackground().brighter());

            for (ActionListener currentListener : aListener) {
                currentListener.actionPerformed(new ActionEvent(me.getSource(), me.getID(), actionCommand));
            }
        }
    }
}
