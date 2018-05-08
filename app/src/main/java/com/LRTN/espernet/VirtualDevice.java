package com.LRTN.espernet;

import java.util.Random;

public class VirtualDevice implements Device
{
    private String name;
    private String state;

    public VirtualDevice()
    {
        Random rand = new Random();
        name = "Relay-"+(rand.nextInt(9000)+1000);

        if (Math.random() < 0.5) {
            state = "on";
        } else {
            state = "off";
        }

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void on() throws Exception
    {
        state = "on";
    }

    public void off() throws Exception
    {
        state = "off";
    }

    public String getState()
    {
        return state;
    }

    public boolean isOn()
    {
        return ("on".equals(state) ? true : false);
    }

    public boolean isOff()
    {
        return ("off".equals(state) ? true : false);
    }

    public String toString()
    {
        return name+" : "+state;
    }
}
