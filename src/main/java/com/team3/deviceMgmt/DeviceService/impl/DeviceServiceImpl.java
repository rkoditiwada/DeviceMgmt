package com.team3.deviceMgmt.DeviceService.impl;

import com.team3.deviceMgmt.DeviceService.DeviceService;
import com.team3.deviceMgmt.models.Device;
import com.team3.deviceMgmt.reopository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    private DeviceRepository deviceRepository;

    public void setDeviceRepository(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> retrieveDevices() {
        List<Device> employees = (List<Device>) deviceRepository.findAll();
        return employees;
    }

    public Device getDevice(Long employeeId) {
        Optional<Device> optEmp = deviceRepository.findById(employeeId);
        return optEmp.get();
    }

    public void saveDevice(Device device){
        deviceRepository.save(device);
    }

    public void deleteDevice(Long deviceId){
        deviceRepository.deleteById(deviceId);
    }

    public void updateDevice(Device device) {
        deviceRepository.save(device);
    }
    
    public List<Device> getDevicesByUserId(String userId)
    {
    	return deviceRepository.findByUserId(userId);
    }


}
