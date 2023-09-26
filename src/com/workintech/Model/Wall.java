package com.workintech.Model;

public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
    public void create () {
        System.out.println("Wall has been created on: " + getDirection() + " direction");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Direction: " + direction + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
