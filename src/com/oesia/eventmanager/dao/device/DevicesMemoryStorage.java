package com.oesia.eventmanager.dao.device;

import java.util.HashMap;

import com.oesia.eventmanager.device.Device;

final class DevicesMemoryStorage
{
    private static HashMap<String, Device> devices = new HashMap<String, Device>();

    public static HashMap<String, Device> getDevicesMap()
    {
        return devices;
    }
}
