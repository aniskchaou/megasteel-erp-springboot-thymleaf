package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.PreventiveMaintenancerepository;

@Service
public class PreventiveMaintenanceDBService implements IDBService {

	@Autowired

	PreventiveMaintenancerepository PreventiveMaintenancerepository;

	@Override
	public void populate() {
		preventiveMaintenance.setMachine(machine);
		preventiveMaintenance.setDuration("11 hours");
		preventiveMaintenance.setReference("lknl77");
		preventiveMaintenance.setType("daily");
		PreventiveMaintenancerepository.save(preventiveMaintenance);
	}

}
