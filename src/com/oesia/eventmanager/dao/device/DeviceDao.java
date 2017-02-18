package com.oesia.eventmanager.dao.device;

import com.oesia.eventmanager.device.Device;

public interface DeviceDao
{
    public Device getDeviceByName(String deviceName);
    
    public boolean updateDevice(Device device);
}
