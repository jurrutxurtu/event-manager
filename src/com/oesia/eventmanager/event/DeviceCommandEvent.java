package com.oesia.eventmanager.event;

import com.oesia.eventmanager.command.ICommand;
import com.oesia.eventmanager.device.Device;

public class DeviceCommandEvent implements IEvent
{
    private Device device;
    private ICommand command;

    public DeviceCommandEvent(Device device, ICommand command)
    {
        this.device = device;
        this.command = command;
    }

    @Override
    public void fire()
    {
        command.execute(device);
        register();
    }
}
