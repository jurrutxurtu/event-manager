package com.oesia.eventmanager.command;

import com.oesia.eventmanager.device.Device;

public class OnCommand implements ICommand
{

    @Override
    public void execute(Device device)
    {
        device.turnOn();
    }

}
