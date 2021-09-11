package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.SystemSetting;

public interface SystemSettingRepository extends JpaRepository<SystemSetting, Long> {

	Optional<SystemSetting> findById(int id);

}
