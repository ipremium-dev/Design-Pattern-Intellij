package com.pattern.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){

    }

    @Override
    public void update() {
        System.out.println("HexaObserver String: " +
                Integer.toBinaryString(subject.getState()) );
    }
}
