package com.workintech.Model;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public void add () {
      System.out.print("Wardrobe added into Bedroom.");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Width: " + width + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Weight: " + weight + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
