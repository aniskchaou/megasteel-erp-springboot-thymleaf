package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.DeliveryVoucherRepository;

@Service
public class DeliveryVoucherDBService implements IDBService {

	@Autowired
	DeliveryVoucherRepository DeliveryVoucherRepository;
	
	@Override
	public void populate() {
		deliveryVoucher.setArticle(article);
		deliveryVoucher.setClient(client);
		deliveryVoucher.setCodeCommande("UGY6");
		deliveryVoucher.setQuantite("66");
		DeliveryVoucherRepository.save(deliveryVoucher);
	}

}
