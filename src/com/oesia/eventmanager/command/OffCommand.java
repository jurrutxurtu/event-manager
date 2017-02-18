package com.oesia.eventmanager.command;

import com.oesia.eventmanager.dao.DaoFactory;
import com.oesia.eventmanager.dao.device.DeviceDao;
import com.oesia.eventmanager.device.Device;

public class OffCommand implements ICommand
{
	private DeviceDao deviceDao = DaoFactory.getDeviceDao("memory");
	
    @Override
    public void execute(Device device)
    {
        device.turnOff();
        deviceDao.updateDevice(device);
    }
}
