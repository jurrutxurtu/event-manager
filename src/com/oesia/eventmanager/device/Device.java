package com.oesia.eventmanager.device;

import static com.oesia.eventmanager.EventManager.DEVICE_LISTENER;

import java.util.Date;

public class Device
{
    private Date lastTurnOnTime;
    private Date lastTurnOffTime;
    private DeviceStatus status;
    private String name;

    public Device(String name)
    {
        this.name = name;
        this.status = DeviceStatus.OFF;
    }

    public String getName()
    {
        return name;
    }

    public void turnOn()
    {
        if (deviceIsOn())
        {
            return;
        }
        lastTurnOnTime = new Date();
        status = DeviceStatus.ON;
    }

    public void turnOff()
    {
        if (!deviceIsOn())
        {
            return;
        }
        status = DeviceStatus.OFF;
        lastTurnOffTime = new Date();
        DEVICE_LISTENER.deviceTurnedOff(this);
    }
    
    public void alarm()
    {
        status = DeviceStatus.ALARM;
        DEVICE_LISTENER.alarmInDevice(this);
    }

    private boolean deviceIsOn()
    {
        return status == DeviceStatus.ON;
    }

    public int lastOnDuration()
    {
        return (int) (lastTurnOffTime.getTime() - lastTurnOnTime.getTime()) / 1000;
    }
}
