package org.mv;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    //1000 = 1'' - 300000 = 5;
    public static final int FIVE_MINUTES = 60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.setProperty("java.awt.headless", "false");
        try {
            Robot robot = new Robot();
            Random random = new Random();
            while (true) {
                robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
                Thread.sleep(FIVE_MINUTES);
                System.out.println(LocalDateTime.now());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}