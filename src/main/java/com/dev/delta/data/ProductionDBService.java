package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ProductionOrderRepository;

@Service
public class ProductionDBService implements IDBService {

	@Autowired
	ProductionOrderRepository productionOrderRepository;
	
	
	@Override
	public void populate() {
		productionOrder.setArticleEntrant(article);
		productionOrder.setArticleSortant(article);
		productionOrder.setCodeMachine(machine);
		productionOrder.setCodeProduction("H7878");
		productionOrder.setEtat("Started");
		productionOrder.setQuantiteRealise("87");
		productionOrder.setQuantiteRestant("8");
		productionOrderRepository.save(productionOrder);
		
	}

}
