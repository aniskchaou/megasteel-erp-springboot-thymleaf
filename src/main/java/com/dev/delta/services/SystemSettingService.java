package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Setting;
import com.dev.delta.repositories.SystemSettingRepository;
@Service
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
	public List<Setting> getSystemSettings()
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
	public void save(Setting systemSetting)
	{
		systemSettingRepository.save(systemSetting);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Setting> findById(int id) {
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
