package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phone extends JPanel implements ActionListener {

    private int phoneX = 50;
    private int phoneY = 50;
    private int phoneWidth = 200;
    private int phoneHeight = 450;

    private int screenX = phoneX + 10;
    private int screenY = phoneY + 10;
    private int screenWidth = phoneWidth - 20;
    private int screenHeight = phoneHeight - 30;

    private Timer timer;

    public Phone() {
        timer = new Timer(30, this);
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
        g2d.fillRect(screenX, screenY, screenWidth, screenHeight);

        //иконки 1 ряд
        g2d.setColor(Color.GREEN);
        g2d.fillRect(screenX + 5, screenY + 20, 30,30);

        g2d.setColor(Color.RED);
        g2d.fillRect(screenX + 50, screenY + 20, 30,30);

        g2d.setColor(Color.GRAY);
        g2d.fillRect(screenX + 100, screenY + 20, 30,30);

        g2d.setColor(Color.YELLOW);
        g2d.fillRect(screenX + 145, screenY + 20, 30,30);

        //иконки 2 ряд
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(screenX + 5, screenY + 70, 30,30);

        g2d.setColor(Color.PINK);
        g2d.fillRect(screenX + 50, screenY + 70, 30,30);

        g2d.setColor(Color.BLACK);
        g2d.fillRect(screenX + 100, screenY + 70, 30,30);

        g2d.setColor(Color.ORANGE);
        g2d.fillRect(screenX + 145, screenY + 70, 30,30);

        //иконки 3 ряд
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(screenX + 5, screenY + 120, 30,30);

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(screenX + 50, screenY + 120, 30,30);

        g2d.setColor(Color.RED);
        g2d.fillRect(screenX + 100, screenY + 120, 30,30);

        g2d.setColor(Color.GREEN);
        g2d.fillRect(screenX + 145, screenY + 120, 30,30);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        phoneX += 2;
        screenX += 2;


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

