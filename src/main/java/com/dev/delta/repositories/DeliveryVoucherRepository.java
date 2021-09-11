package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.DeliveryVoucher;

public interface DeliveryVoucherRepository extends JpaRepository<DeliveryVoucher, Long> {

	Optional<DeliveryVoucher> findById(int id);

}
