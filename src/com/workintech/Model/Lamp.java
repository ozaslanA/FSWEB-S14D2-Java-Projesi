package com.workintech.Model;

import com.workintech.Enums.LampType;

public class Lamp {

    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Style: " + style + "\n");
        builder.append("Battery: " + battery + "\n");
        builder.append("GlobRating: " + globRating + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }

}
