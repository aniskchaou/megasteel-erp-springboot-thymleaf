package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
