package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class characterTest {
    @Test
    void createCharacterTest(){
        Action test = new Action("Fireball");
        String languages[] = new String[]{"English","Elvish"};
        Action actions[] = new Action[]{test};

        //Correct Character test
        Character testCharacter = new Character("Bilbo",100,18,10,14,15,
                11,12,50,60,"Lawful Evil",languages,actions);
        assertEquals("Bilbo", testCharacter.getName());
        assertEquals(100,testCharacter.getHP());
        assertEquals(18,testCharacter.getStrength());
        assertEquals(10,testCharacter.getDexterity());
        assertEquals(14,testCharacter.getConstitution());
        assertEquals(15,testCharacter.getIntelligence());
        assertEquals(11,testCharacter.getWisdom());
        assertEquals(12,testCharacter.getCharisma());
        assertEquals(50,testCharacter.getSpeed());
        assertEquals(60,testCharacter.getArmor());
        assertEquals("Lawful Evil",testCharacter.getAlignment());
        assertEquals("English, Elvish, ",testCharacter.getLanguages());
        assertEquals("Fireball, ", testCharacter.getActions());
    }

    @Test
    void createInvalidCharacterTest(){
        Action test = new Action("Fireball");
        String languages[] = new String[]{"English","Elvish"};
        Action actions[] = new Action[]{test};

        assertThrows(IndexOutOfBoundsException.class, ()-> new Character("Bilbo",100,21,
                10,14,15, 11,12,50,
                60,"Lawful Evil",languages,actions));
    }
}
