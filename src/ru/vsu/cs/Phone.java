package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phone extends JPanel implements ActionListener {

    private int phoneX = 50;
    private int phoneY = 50;
    private int phoneWidth = 150;
    private int phoneHeight = 300;

    private int screenWidth = phoneWidth - 40;
    private int screenHeight = phoneHeight - 60;
    private Timer timer;

    public Phone() {
        timer = new Timer(10, this);
        timer.start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        //корпус
        g2d.setColor(Color.BLACK);
        g2d.fillRect(phoneX, phoneY, phoneWidth, phoneHeight);

        //экран
        g2d.setColor(Color.CYAN);
        g2d.fillRect(phoneX + 20, phoneY + 20, screenWidth, screenHeight);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        phoneX += 2;
        phoneY += 2;

        repaint(); // перерисовываем панель
    }



    public static void main(String[] args) {
        JFrame window = new JFrame("Phone");
        window.setSize(400, 600);
        window.add(new Phone());
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}

