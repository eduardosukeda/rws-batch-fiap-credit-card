package br.com.fiap.rwsbatchfiapcreditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Purchase;
import br.com.fiap.rwsbatchfiapcreditcard.service.PurchaseService;

import java.util.List;

@RestController
@RequestMapping("purchase")
public class PurchaseController {

	@Autowired
	PurchaseService purchaseService;

	@PostMapping
	public Purchase create(@RequestParam Integer idCard, @RequestBody Purchase purchase) {
		return purchaseService.create(idCard, purchase);
	}

	@DeleteMapping("/{id}")
	public void delete(@RequestParam Integer idCard, @RequestParam Integer id) {
		purchaseService.delete(idCard, id);
	}

	@GetMapping
	public List<Purchase> listByCard(@RequestParam Integer idCard) {
		return purchaseService.listByCard(idCard);
	}
}
