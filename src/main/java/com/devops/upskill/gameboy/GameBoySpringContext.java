package com.devops.upskill.gameboy;
import com.devops.upskill.gameboy.games.GameRunner;
import com.devops.upskill.gameboy.games.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameBoySpringContext {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("GameBoySpringConfiguration.class")) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
        catch(Exception e) {
            throw e;
        }
    }
}
