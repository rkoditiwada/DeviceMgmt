package com.team3.deviceMgmt.reopository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 7/13/2019.
 */

import com.team3.deviceMgmt.models.Device;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {

	public List<Device> findByUserId(String userId);
		
	

}