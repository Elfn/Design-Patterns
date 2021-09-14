package com.dp.ef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Football game Runner initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football game Runner starting...");
        addingCharacterAction();
    }

    @Override
    void endPlay() {
        System.out.println("Football game Runner ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new character to the game");
    }

    public boolean addingCharacterAction(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            this.addNewCharacterToTheGame();
            return true;
        }else {
            return false;
        }
    }



    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add a new character to a game? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }
        catch (IOException ioe){
            System.out.println("IO Error");
        }
        if(answer == null){
            return "no";
        }

        return answer;
    }


}
