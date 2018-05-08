package com.LRTN.espernet;

public interface Device
{
    public String getName();
    public void setName(String name);
    public void on() throws Exception;
    public void off() throws Exception;
    public String getState();
    public boolean isOn();
    public boolean isOff();
}
