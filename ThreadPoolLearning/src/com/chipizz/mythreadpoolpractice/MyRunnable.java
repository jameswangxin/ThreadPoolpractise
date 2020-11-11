package com.chipizz.mythreadpoolpractice;

import java.util.Date;

public class MyRunnable implements Runnable {
    private String Command;

    public  MyRunnable(String s) {
        this.Command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start time= " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End time= " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}