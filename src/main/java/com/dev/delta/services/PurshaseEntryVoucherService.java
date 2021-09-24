package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.PurshaseEntryVoucher;
import com.dev.delta.repositories.PurshaseEntryVoucherRepository;
@Service
public class PurshaseEntryVoucherService {
	/**
	 * purshaseEntryVoucherRepository
	 */
	@Autowired
	private PurshaseEntryVoucherRepository purshaseEntryVoucherRepository;
	

	/**
	 * getPurshaseEntryVouchers
	 * @return
	 */
	public List<PurshaseEntryVoucher> getPurshaseEntryVouchers()
	{
		return purshaseEntryVoucherRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return purshaseEntryVoucherRepository.count();
	}

	/**
	 * save
	 * @param purshaseEntryVoucher
	 */
	public void save(PurshaseEntryVoucher purshaseEntryVoucher)
	{
		purshaseEntryVoucherRepository.save(purshaseEntryVoucher);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<PurshaseEntryVoucher> findById(int id) {
		return purshaseEntryVoucherRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		purshaseEntryVoucherRepository.delete(purshaseEntryVoucherRepository.findById(id).get());
	}
}
