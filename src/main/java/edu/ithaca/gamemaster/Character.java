package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class Character {
    private int hitPts;
    private int armor;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int speed;
    private String name;
    private String alignment;
    private String languages[];
    private Action actions[];

    public Character(String name,int startingHP,int initialStrength,int initialDexterity,int initialConstitution,int initialIntelligence,
                     int initialWisdom,int initialCharisma,int initialSpeed,int initialArmor,String alignment,
                     String languages[], Action actions[]){
        this.name = name;
        this.hitPts=startingHP;
        this.strength=initialStrength;
        this.dexterity=initialDexterity;
        this.constitution=initialConstitution;
        this.intelligence=initialIntelligence;
        this.wisdom=initialWisdom;
        this.charisma=initialCharisma;
        this.speed=initialSpeed;
        this.armor=initialArmor;
        this.alignment=alignment;
        this.languages=languages;
        this.actions=actions;
    }

    public void setHP(int startingHP){
        this.hitPts=startingHP;
    }

    public String getName(){ return name;}
    public int getHP(){ return hitPts;}
    public int getStrength(){ return strength;}
    public int getDexterity(){ return dexterity;}
    public int getConstitution(){ return constitution;}
    public int getIntelligence(){ return intelligence;}
    public int getWisdom(){ return wisdom;}
    public int getCharisma(){ return charisma;}
    public int getSpeed(){ return speed;}
    public int getArmor(){ return armor;}
    public String getAlignment(){ return alignment;}
    public String getLanguages(){
        StringBuilder languagesAll = new StringBuilder();
        for(int i=0;i<languages.length;i++){
            languagesAll.append(languages[i]);
            languagesAll.append(", ");
        }
        String lang = languagesAll.toString();
        return lang;
    }
    public String getActions(){
        StringBuilder actionsAll = new StringBuilder();
        for(int i=0;i<actions.length;i++){
            actionsAll.append(actions[i].getName());
            actionsAll.append(", ");
        }
        String act = actionsAll.toString();
        return act;
    }
}
