package com.team3.deviceMgmt.controller;


import com.team3.deviceMgmt.DeviceService.DeviceService;
import com.team3.deviceMgmt.models.Device;
import com.team3.deviceMgmt.reopository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value="/getDevice/{userId}", method= RequestMethod.GET)
    public String getDevice()
    {
        return "Hello Get Method in getDevice";
    }
    @GetMapping("/api/devices")
    public List<Device> getDevices() {
        List<Device> employees = deviceService.retrieveDevices();
        return employees;
    }

    @RequestMapping(value="/addDevice", method= RequestMethod.POST)
    public String getDevice(@RequestBody Device device)
    {

       return deviceService.saveDevice(device);
    }

    @SuppressWarnings("unused")
	@RequestMapping(value="/api/delete/{deviceId}", method= RequestMethod.DELETE)
    public String deleteDevice(@PathVariable(value = "deviceId") long deviceid )
    {
    	System.out.println("deviceid:"+deviceid);
    	Device device = deviceService.getDevice(deviceid);
    	//System.out.println("device id from db:"+device.getDeviceId());
    	if(device == null ) {
    		return "No device details found";
    	}
    	
    	deviceService.deleteDevice(deviceid);
    	
        return "Deleted successfully";
    }

    @GetMapping("/api/devices/{userId}")
    public List<Device> getDevicesByUserId(@PathVariable("userId") String userId) {
        List<Device> devices = deviceService.getDevicesByUserId(userId);
        return devices;
    }
}
