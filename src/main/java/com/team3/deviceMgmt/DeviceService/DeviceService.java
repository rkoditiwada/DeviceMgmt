package com.team3.deviceMgmt.DeviceService;

import com.team3.deviceMgmt.models.Device;

import java.util.List;


public interface DeviceService {

    public List<Device> retrieveDevices();

    public Device getDevice(Long deviceId);

    public void saveDevice(Device device);

    public void deleteDevice(Long deviceId);

    public void updateDevice(Device device);
}
