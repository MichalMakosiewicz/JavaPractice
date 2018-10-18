package com.makosavage;

public class TV {

    private boolean isOn;
    private int channel;

    public TV(boolean isOn, int channel) {
        this.isOn = isOn;
        this.channel = channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void takeAntena(){
        System.out.println("Taking antena");
    }
}
