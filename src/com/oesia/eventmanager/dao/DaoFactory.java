package com.oesia.eventmanager.dao;

import com.oesia.eventmanager.dao.device.DeviceDao;
import com.oesia.eventmanager.dao.device.MemoryDeviceDao;
import com.oesia.eventmanager.dao.event.EventDao;
import com.oesia.eventmanager.dao.event.MemoryEventDao;

public class DaoFactory
{
    public static DeviceDao getDeviceDao(String type)
    {
        // We ignore the type of the Dao because we currently only use the in
        // 'memory' type(To use when other DeviceDao types are implemented)
        return new MemoryDeviceDao();
    }
    
    public static EventDao getEventDao(String type)
    {
        // We ignore the type of the Dao because we currently only use the in
        // 'memory' type(To use when other EventDao types are implemented)
        return new MemoryEventDao();
    }
}
