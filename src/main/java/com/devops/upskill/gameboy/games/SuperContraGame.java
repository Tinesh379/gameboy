package com.devops.upskill.gameboy.games;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("climb");
    }
    public void down(){
        System.out.println("slide");
    }
    public void left(){
        System.out.println("push");
    }
    public void right(){
        System.out.println("pull");
    }

}
