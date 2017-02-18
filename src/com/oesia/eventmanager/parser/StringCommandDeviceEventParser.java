package com.oesia.eventmanager.parser;

import java.util.HashMap;
import java.util.Map;

import com.oesia.eventmanager.command.AlertCommand;
import com.oesia.eventmanager.command.ICommand;
import com.oesia.eventmanager.command.OffCommand;
import com.oesia.eventmanager.command.OnCommand;

public class StringCommandDeviceEventParser {
	
	@SuppressWarnings("serial")
	private static Map<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() {
		{
			put("ON", new OnCommand());
			put("OFF", new OffCommand());
			put("ALARM", new AlertCommand());
		}
	};

	private String eventString;

	public StringCommandDeviceEventParser(String eventString) {
		
		this.eventString = eventString;
	}

	public ICommand getEntryCommand() {
		String commmandString = eventString.split(" ")[0];
		return stringToCommandMap.get(commmandString);
	}

	public String getEntryDeviceName() {
		return eventString.split(" ")[1];
	}

}
