package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.delta.entities.Setting;
import com.dev.delta.repositories.SystemSettingRepository;

@Service
public class SettingService {
	/**
	 * settingRepository
	 */
	@Autowired
	private SystemSettingRepository settingRepository;
	

	/**
	 * getSettings
	 * @return
	 */
	public List<Setting> getSettings()
	{
		return settingRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return settingRepository.count();
	}

	/**
	 * save
	 * @param setting
	 */
	public void save(Setting setting)
	{
		settingRepository.save(setting);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Setting> findById(int id) {
		return settingRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		settingRepository.delete(settingRepository.findById(id).get());
	}
}
