package com.dp.ef;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //Template method
    public final void play(){
        loadAssets();
        initialize();
        startPlay();
//        if(addNewGameCharacter()){
//            addNewCharacterToTheGame();
//        }
        endPlay();
    }

     void loadAssets(){
         System.out.println("Loading Game Assets");
    }
    //Hooked on template method
    protected abstract void addNewCharacterToTheGame();



}
