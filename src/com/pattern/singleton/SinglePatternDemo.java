package com.pattern.singleton;

public class SinglePatternDemo {

    public static void main(String[] args){

        SingleObject firstObject = SingleObject.getInstance();
        // Set message to first object
        firstObject.setMessage("Hello world");

        SingleObject secondObject = SingleObject.getInstance();

        // Data was pulled from same object instance
        System.out.println(secondObject.getMessage());


    }
}
