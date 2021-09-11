package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.SystemSetting;
import com.dev.delta.repositories.SystemSettingRepository;

public class SystemSettingService {
	/**
	 * systemSettingRepository
	 */
	@Autowired
	private SystemSettingRepository systemSettingRepository;
	

	/**
	 * getSystemSettings
	 * @return
	 */
	public List<SystemSetting> getSystemSettings()
	{
		return systemSettingRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return systemSettingRepository.count();
	}

	/**
	 * save
	 * @param systemSetting
	 */
	public void save(SystemSetting systemSetting)
	{
		systemSettingRepository.save(systemSetting);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<SystemSetting> findById(int id) {
		return systemSettingRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		systemSettingRepository.delete(systemSettingRepository.findById(id).get());
	}
}
