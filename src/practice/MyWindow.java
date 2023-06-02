package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;

    private JLabel clockLabel;

    private Font font = new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");
        setSize(500,500);
        setLocation(300,50);
        this.createGUI();
        this.startClock();
        setVisible(true);
    }

    public void createGUI(){
//        JLabel("TopCenter", SwingConstants.CENTER);
        heading = new JLabel("CLOCK",SwingConstants.CENTER);
        clockLabel = new JLabel("",SwingConstants.CENTER);

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));

        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock() {
        /*
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date().toString();
//                String dateTime_1 = new Date.toLocaleString();
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh : mm : ss a");
                String dateTime = sdf.format(date);
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
        */
        //with help of Thread

        Thread th = new Thread() {

            public void run() {
                try {
                    while (true) {
                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM hh:mm:ss a");
                        String dateTime = sdf.format(d);
                        clockLabel.setText(dateTime);

                        Thread.currentThread().sleep(1000);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }
}
