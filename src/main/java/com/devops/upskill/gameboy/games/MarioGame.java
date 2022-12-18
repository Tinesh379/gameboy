package com.devops.upskill.gameboy.games;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("crouch");
    }
    public void left(){
        System.out.println("sprint left");
    }
    public void right(){
        System.out.println("sprint right");
    }

}

