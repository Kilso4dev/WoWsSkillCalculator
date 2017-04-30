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

    public ClickLabel(String title) {
        super(title);
    }

    public ClickLabel(String title, int horizontalAlignment) {
        super(title, horizontalAlignment);
    }

    public ClickLabel(String title, Icon icon, int horizontalAlignment) {
        super(title, icon, horizontalAlignment);
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



    public void setActionCommand(String command) {
        this.actionCommand = command;
    }

    public String getActionCommand() {
        return this.actionCommand;
    }


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
