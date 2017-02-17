package com.oesia.eventmanager.dao.event;

import java.util.List;

import com.oesia.eventmanager.event.IEvent;

public interface EventDao
{
    public void storeEvent(IEvent event);
    
    public IEvent getLastEvent();
    
    public List<IEvent> getAllEvents();
}
