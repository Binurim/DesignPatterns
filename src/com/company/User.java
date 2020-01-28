package com.company;

public class User {
    //Fieldsl(attributes)
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age= age;

    }

    //Methods
    public void sayHello(){
        System.out.println("Hi, my name is" + ""+ this.name );
        System.out.println("Hi, my age is" + ""+ this.age );

    }
}
