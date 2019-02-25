package edu.ithaca.gamemaster;

public class helloWorld {
    private String hello;

    public helloWorld(String hello){
        this.hello = hello;
    }

    public String sayHello(){
        System.out.println(hello);
        return hello;
    }

    public boolean isEmpty(){
        if(hello.isEmpty()){
            return true;
        }
        return false;
    }

    public void setMessage(String message){
        hello = message;
    }
}
