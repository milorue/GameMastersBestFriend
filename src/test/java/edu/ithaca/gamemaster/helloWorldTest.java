package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class helloWorldTest {

    @Test
    void helloWorldMessageTest(){
        helloWorld test = new helloWorld("Hello World!");
        assertEquals("Hello World!",test.sayHello());
    }

    @Test
    void setMessageTest(){
        helloWorld messageTest = new helloWorld("");
        assertEquals(true,messageTest.isEmpty());
        messageTest.setMessage("Hello Dude!");
        assertEquals(false,messageTest.isEmpty());
    }

    @Test
    void emptyTest(){
        helloWorld emptyTest = new helloWorld("Hello World!");
        assertEquals(false,emptyTest.isEmpty());
        emptyTest.setMessage("");
        assertEquals(true,emptyTest.isEmpty());
    }
}