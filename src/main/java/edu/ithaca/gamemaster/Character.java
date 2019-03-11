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
        if(initialStrength > 20 || initialDexterity > 20 || initialConstitution > 20 || initialIntelligence > 20
                || initialWisdom > 20 || initialCharisma > 20 || initialStrength < 0
                || initialDexterity < 0 || initialConstitution < 0 || initialIntelligence < 0 || initialWisdom < 0 || initialCharisma < 0
                || initialSpeed < 0 || initialArmor < 0){
            throw new IndexOutOfBoundsException("Modifiers can only be less than 20 and greater than 0");
        }
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
    public void setName(String newName){this.name=newName;}
    public void setStrength(int newStrength){this.strength=newStrength;}
    public void setDexterity(int newDexterity){this.dexterity=newDexterity;}
    public void setConstitution(int newConstitution){this.constitution=newConstitution;}
    public void setIntelligence(int newIntelligence){this.intelligence=newIntelligence;}
    public void setWisdom(int newWisdom){this.wisdom=newWisdom;}
    public void setCharisma(int newCharisma){this.charisma=newCharisma;}
    public void setSpeed(int newSpeed){this.speed=newSpeed;}
    public void setArmor(int newArmor){this.armor=newArmor;}
    public void setAlignment(String newAlignment){this.alignment=newAlignment;}
    public void addLanguage(String newLanguage){
        int confirm = 0;
        for(int i = 0; i<languages.length; i++){
            if(languages[i].isEmpty()){
                languages[i] = newLanguage;
                confirm = 1;
            }
            else{

            }
        }
        if(confirm != 1){
            throw new IndexOutOfBoundsException("New Language wasn't added to array");
        }
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
