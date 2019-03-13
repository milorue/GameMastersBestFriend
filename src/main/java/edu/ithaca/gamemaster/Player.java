package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class Player extends Character{
    public Player(String name){
        super(name);


    }

    public Player(Character character){
        super(character.getName());

    }
}
