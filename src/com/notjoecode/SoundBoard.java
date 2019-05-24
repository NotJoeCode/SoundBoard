package com.notjoecode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SoundBoard implements ActionListener, ItemListener {
    private SoundGetter sg1 = new SoundGetter();
    private NameShower ns = new NameShower();
    private boolean pressed;
    private JCheckBox showFileNames;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;

    public SoundBoard (){
        showFileNames.addItemListener(this);
        button1.setActionCommand("button1");
        button1.addActionListener(this);
        button2.setActionCommand("button2");
        button2.addActionListener(this);
        button3.setActionCommand("button3");
        button3.addActionListener(this);
        button4.setActionCommand("button4");
        button4.addActionListener(this);
        button5.setActionCommand("button5");
        button5.addActionListener(this);
        button6.setActionCommand("button6");
        button6.addActionListener(this);
        button7.setActionCommand("button7");
        button7.addActionListener(this);
        button8.setActionCommand("button8");
        button8.addActionListener(this);
        button9.setActionCommand("button9");
        button9.addActionListener(this);
        button10.setActionCommand("button10");
        button10.addActionListener(this);
        button11.setActionCommand("button11");
        button11.addActionListener(this);
        button12.setActionCommand("button12");
        button12.addActionListener(this);
        button13.setActionCommand("button13");
        button13.addActionListener(this);
        button14.setActionCommand("button14");
        button14.addActionListener(this);
        button15.setActionCommand("button15");
        button15.addActionListener(this);
        button16.setActionCommand("button16");
        button16.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand().replaceAll("\\D+", "");
        int x = Integer.parseInt(s);
        sg1.getFileName(x);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        pressed = !pressed;

    }
}
