package com.oesia.eventmanager.parser;

import java.util.HashMap;
import java.util.Map;

import com.oesia.eventmanager.command.AlertCommand;
import com.oesia.eventmanager.command.ICommand;
import com.oesia.eventmanager.command.OffCommand;
import com.oesia.eventmanager.command.OnCommand;
import com.oesia.eventmanager.event.IEvent;

public class StringEventParser
{
    private static Map<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() {
        {
            put("ON", new OnCommand());
            put("OFF", new OffCommand());
            put("ALARM", new AlertCommand());
        }
    };

    private String entryString;

    public StringEventParser(String entry)
    {
        this.entryString = entry;
    }
    
    

    public String getEntryDeviceName()
    {
        return entryString.split(" ")[1];
    }

    public ICommand getEntryCommand()
    {
        String commmandString = entryString.split(" ")[0];
        return stringToCommandMap.get(commmandString);
    }
    
    public IEvent toEvent()
    {
        return null;
    }
}
