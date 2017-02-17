package com.oesia.eventmanager.command;

import com.oesia.eventmanager.device.Device;

public interface ICommand
{
    public void execute(Device device);
}
