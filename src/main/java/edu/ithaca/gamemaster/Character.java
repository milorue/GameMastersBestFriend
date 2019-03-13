package edu.ithaca.gamemaster;

import java.lang.reflect.Array;
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
    private ArrayList<String> languages;
    private ArrayList<Action> actions;

    //Constructor

    public Character(String name){
        this.name = name;
    }

    //Validation Methods

    private static void checkValid20(int input){
        if(input > 20){
            throw new IndexOutOfBoundsException("Modifiers can only be less than 20");
        }
    }

    private static void checkValid0(int input){
        if(input < 0){
            throw new IllegalArgumentException("Modifiers cannot be less than 0");
        }
    }

    private static boolean checkListAdd(ArrayList list,Object item ){
        if(list.contains(item)){
            return true; }
        else{
            return false; }
    }

    //Set Methods

    public void setHP(int startingHP){
        checkValid0(startingHP);
        this.hitPts=startingHP;
    }
    public void setName(String newName){this.name=newName;}

    public void setStrength(int newStrength){
        checkValid20(newStrength);
        checkValid0(newStrength);
        this.strength=newStrength;}
    public void setDexterity(int newDexterity){this.dexterity=newDexterity;}
    public void setConstitution(int newConstitution){this.constitution=newConstitution;}
    public void setIntelligence(int newIntelligence){this.intelligence=newIntelligence;}
    public void setWisdom(int newWisdom){this.wisdom=newWisdom;}
    public void setCharisma(int newCharisma){this.charisma=newCharisma;}
    public void setSpeed(int newSpeed){this.speed=newSpeed;}
    public void setArmor(int newArmor){this.armor=newArmor;}
    public void setAlignment(String newAlignment){this.alignment=newAlignment;}
    public void setLanguages(ArrayList<String> languages){ this.languages=languages;}
    public void setActions(ArrayList<Action> actions){ this.actions=actions;}

    //List add stuff

    public void addLanguage(String newLanguage){
        languages.add(newLanguage);
        boolean checked = checkListAdd(languages,newLanguage);
        if(checked){
            //do nothing
        }
        else{
            throw new IndexOutOfBoundsException("Language wasn't added to list");
        }
    }

    public void addAction(Action newAction){
        actions.add(newAction);
        boolean checked = checkListAdd(actions,newAction);
        if(checked){
            //do nothing
        }
        else{
            throw new IndexOutOfBoundsException("Action wasn't added to list");
        }

    }

    //Get Methods

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

    //List stuff

    public String getLanguages(){
        return languages.toString();
    }
    public String getActions(){
        return actions.toString();
    }
    public ArrayList<String> getLanguageList(){
        return languages;
    }
    public ArrayList<Action> getActionsList(){
        return actions;
    }
}
