package com.oesia.eventmanager.dao.event;

import java.util.Stack;

import com.oesia.eventmanager.event.IEvent;

final class EventsMemoryStorage
{
    private static Stack<IEvent> events = new Stack<IEvent>();

    public static Stack<IEvent> getEventsStack()
    {
        return events;
    }
}
