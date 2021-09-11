package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ProductionEntryVoucher;

public interface ProductionEntryVoucherRepository extends JpaRepository<ProductionEntryVoucher, Long> {

	Optional<ProductionEntryVoucher> findById(int id);

}
