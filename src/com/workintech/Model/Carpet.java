package com.workintech.Model;

import com.workintech.Enums.PaintColor;

public class Carpet {
   private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
    public void lying () {
       System.out.print("Carpet is lying on Bedroom floor." );
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Width: " + width + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Color: " + color + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
