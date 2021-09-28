package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.DeliveryVoucher;
import com.dev.delta.repositories.DeliveryVoucherRepository;

@Service
public class DeliveryVoucherService {
	/**
	 * deliveryVoucherRepository
	 */
	@Autowired
	private DeliveryVoucherRepository deliveryVoucherRepository;

	/**
	 * getDeliveryVouchers
	 * 
	 * @return
	 */
	public List<DeliveryVoucher> getDeliveryVouchers() {
		return deliveryVoucherRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return deliveryVoucherRepository.count();
	}

	/**
	 * save
	 * 
	 * @param deliveryVoucher
	 */
	public void save(DeliveryVoucher deliveryVoucher) {
		deliveryVoucherRepository.save(deliveryVoucher);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<DeliveryVoucher> findById(int id) {
		return deliveryVoucherRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		deliveryVoucherRepository.delete(deliveryVoucherRepository.findById(id).get());
	}
}
