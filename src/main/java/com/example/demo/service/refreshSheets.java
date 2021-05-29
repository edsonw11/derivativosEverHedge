package com.example.demo.service;

import com.example.demo.controller.SheetsQuickstart;

import java.util.Timer;
import java.util.TimerTask;

public class refreshSheets {

    public static void main(String[] args) {

        long tempo = (10000 * 1); // chama o método a cada 3 segundos

        Timer timer = null;

        if (timer == null) {

            timer = new Timer();
            TimerTask tarefa = new TimerTask() {

                public void run() {
                    try {
                        System.out.println("executando ......." + this.toString());
                        SheetsQuickstart.doList();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            timer.scheduleAtFixedRate(tarefa, tempo, tempo);
        }

    }

}

