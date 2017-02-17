package com.oesia.eventmanager.event;

import com.oesia.eventmanager.dao.DaoFactory;

public interface IEvent
{
    public void fire();
    
    default void register()
    {
        DaoFactory.getEventDao("memory").storeEvent(this);
    }
}
