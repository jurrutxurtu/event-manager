package com.oesia.eventmanager;

import com.oesia.eventmanager.event.IEvent;
import com.oesia.eventmanager.listener.DeviceListener;
import com.oesia.eventmanager.parser.StringEventParser;

public final class EventManager
{
    public static final DeviceListener DEVICE_LISTENER = new DeviceListener();
    
    public void run(final String eventString) 
    {
        IEvent event = new StringEventParser(eventString).toEvent();
        event.fire();
    }
}
