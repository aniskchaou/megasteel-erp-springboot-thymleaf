package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Setting;

public interface SystemSettingRepository extends JpaRepository<Setting, Long> {

	Optional<Setting> findById(int id);

}
