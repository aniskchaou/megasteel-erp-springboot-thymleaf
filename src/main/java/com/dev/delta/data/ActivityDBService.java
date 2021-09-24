package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ActivityRepository;

@Service
public class ActivityDBService implements IDBService {

	@Autowired
	ActivityRepository  activityRepository;
	
	@Override
	public void populate() {
		activity.setArticleNumber("1113");
		activity.setFamilyIn(family);
		activity.setFamilyOut(family);
		activity.setMachineNumber("44");
		activity.setName("Forgery");
		
		activityRepository.save(activity);
		
	}

}
