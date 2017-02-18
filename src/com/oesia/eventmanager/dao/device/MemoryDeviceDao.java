package com.oesia.eventmanager.dao.device;

import com.oesia.eventmanager.device.Device;

public class MemoryDeviceDao implements DeviceDao {
	@Override
	public Device getDeviceByName(String deviceName) {
		// If the device we are trying to retrive does not exist, we create it,
		// store it and send it back.
		if (!DevicesMemoryStorage.getDevicesMap().containsKey(deviceName)) {
			DevicesMemoryStorage.getDevicesMap().put(deviceName,
					new Device(deviceName));
		}
		return DevicesMemoryStorage.getDevicesMap().get(deviceName);
	}

	@Override
	public boolean updateDevice(Device device) {
		return true;
	}
}
