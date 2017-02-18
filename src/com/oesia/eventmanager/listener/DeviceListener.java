package com.oesia.eventmanager.listener;

import com.oesia.eventmanager.command.AlertCommand;
import com.oesia.eventmanager.device.Device;
import com.oesia.eventmanager.event.DeviceCommandEvent;
import com.oesia.eventmanager.output.OutputChannel;

public class DeviceListener
{
    public void deviceTurnedOff(Device device)
    {
        new DeviceCommandEvent(device, new AlertCommand()).fire();
    }
    
    public void alarmInDevice(Device device)
    {
    	OutputChannel.displayMessage("ALARM " + device.getName() + " " + device.lastOnDuration());
    }
}
