package com.devops.upskill.gameboy;
import com.devops.upskill.gameboy.games.GameRunner;
import com.devops.upskill.gameboy.games.GamingConsole;
import com.devops.upskill.gameboy.games.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameBoySpringConfiguration {
    @Bean
    public GamingConsole game(){
         var game = new MarioGame();
         return game;
   }
   @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
   }
}
