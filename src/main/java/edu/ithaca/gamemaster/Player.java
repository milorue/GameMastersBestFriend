package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class Player extends Character{
    public Player(String name, int startingHP, int initialStrength, int initialDexterity, int initialConstitution, int initialIntelligence,
                  int initialWisdom, int initialCharisma, int initialSpeed, int initialArmor, String alignment,
                  ArrayList<String> languages, ArrayList<Action> actions){
        super(name);


    }

    public Player(Character character){
        super(character.getName());

    }
}
