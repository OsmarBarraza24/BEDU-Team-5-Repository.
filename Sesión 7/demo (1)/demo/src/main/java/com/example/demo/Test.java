package com.example.demo;

public class Test {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    String apellidos;

    @Override
    public String toString() {
        return
                "\nName: " + this.name +
                "\nLast Name: " + this.apellidos + "\n";
    }
}
