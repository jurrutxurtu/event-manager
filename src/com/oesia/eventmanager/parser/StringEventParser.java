package com.oesia.eventmanager.parser;

import com.oesia.eventmanager.dao.DaoFactory;
import com.oesia.eventmanager.dao.device.DeviceDao;
import com.oesia.eventmanager.device.Device;
import com.oesia.eventmanager.event.DeviceCommandEvent;
import com.oesia.eventmanager.event.IEvent;

public class StringEventParser
{
	
	private static final String COMMAND_DEVICE_EVENT_PATTERN = "(ON|OFF|ALARM)(\\s){1}(\\w)+";
	
	private DeviceDao deviceDao = DaoFactory.getDeviceDao("memory");
	
    private String eventString;

    public StringEventParser(String entry)
    {
        this.eventString = entry;
    }
    
    public IEvent toEvent()
    {
    	if (isACommandDeviceEventString())
    	{
    		StringCommandDeviceEventParser commandDeviceParser = new StringCommandDeviceEventParser(eventString);
    		Device device = deviceDao.getDeviceByName(commandDeviceParser.getEntryDeviceName());
    		return new DeviceCommandEvent(device, commandDeviceParser.getEntryCommand());
    	}
    	return null;
    }
    
    private boolean isACommandDeviceEventString()
    {
    	return eventString.matches(COMMAND_DEVICE_EVENT_PATTERN);
    }
}
